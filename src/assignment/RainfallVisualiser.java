package assignment;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import textio.TextIO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class RainfallVisualiser extends Application {
    /**
     *
     * Author: Praise Kamusasa
     * Version: 1.0
     * Description:
     */

    /**
     * Draws a picture.  The parameters width and height give the size
     * of the drawing area, in pixels.
     */
    final String FILE_PATH = "resources/sample_analysed.csv";
    static final double margin = 20;
    final static Integer rotationVertical = 90;

    public void drawPicture(GraphicsContext g, int width, int height) {

        // draw a rectangle
        //g.setFill(Color.YELLOWGREEN);
        //g.fillRect(100, 100, 200, 100);

        // draw an oval
        //g.fillOval(400, 400, 100, 100); // a circle
        //g.setStroke(Color.BLACK);
        //g.strokeOval(400, 400, 100, 100);

        //
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Filepath: ");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JButton button = new JButton("Submit");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);

        JLabel success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);



        double maxMonthlyRainfall = getMaxMonthlyRainfall(FILE_PATH);
        System.out.println("Max = " + maxMonthlyRainfall);

        // TODO: draw the x-axis and y-axis
        double margin = 20;
        Point2D originPoint = new Point2D(margin, height - margin);

        // draw y-axis
        g.setStroke(Color.GREEN);
        g.setLineWidth(1);
        g.strokeLine(originPoint.getX(), margin,
                originPoint.getX(), originPoint.getY());
        // draw x-axis
        g.strokeLine(originPoint.getX(), originPoint.getY(), width - margin, originPoint.getY());

        // TODO: draw the monthly totals as a bar chart
        double xAxisLength = width - 2.0 * margin;
        double yAxisLength = height - 2.0 * margin;
        double barWidth = xAxisLength / getNumOfRecords(FILE_PATH);
        double currentPointX = originPoint.getX();
        double barHeight = maxMonthlyRainfall * yAxisLength + 1;
        int numOfRecords = (int) getNumOfRecords(FILE_PATH);
        int numOfRows = (int) (yAxisLength / margin);
        int ratioOfVerticalScale = (int) (maxMonthlyRainfall / yAxisLength) + 1;
        int currentRecords = 0;

        verticalLine(g, height, barWidth, numOfRecords);
        horizontalLines(g, width, ratioOfVerticalScale, height, numOfRows);
        currentPointX += barWidth;
        double currentPointY = originPoint.getY() - barHeight;
        g.setFill(Color.RED);
        System.out.println("barWidth = " + barWidth);

        //textio
        TextIO.readFile(FILE_PATH);
        //read and ignore the first line
        String line = TextIO.getln();
        System.out.println(line);

        while (!TextIO.eof()) {
            currentRecords++;
            String[] record = TextIO.getln().trim().split(",");
            double monthlyTotal = Double.parseDouble(record[2]);
            barHeight = (monthlyTotal / maxMonthlyRainfall) * yAxisLength;
            currentPointY = originPoint.getY() - barHeight;
            //set fill color alternately: red - blue - red -blue ...
            if (currentRecords % 2 == 0) {
                g.setFill(Color.PURPLE);
            } else {
                g.setFill(Color.HOTPINK);
            }
            g.fillRect(currentPointX, currentPointY, barWidth, barHeight);        //get a record

            // continue to the next point
            currentPointX += barWidth;

        }
        System.out.println(currentRecords);


    }


    private void horizontalLines(GraphicsContext g, int width, int ratioOfY, int height, int numOfRows) {
        for (int i = 0; i < numOfRows + 1; i++) {

            g.strokeLine(margin, margin + (margin * i), width - margin, margin + (margin * i));
            g.setTextAlign(TextAlignment.CENTER);
            g.setTextBaseline(VPos.TOP);

            // draw Y axis label
            String count = Integer.toString((int) (margin * i * ratioOfY));
            if (i > 0) {
                g.rotate(rotationVertical);
                g.fillText(count, height - margin - (margin * i), -margin);
                g.rotate(-rotationVertical);
            }
        }
    }

    double getMaxMonthlyRainfall(String filePath) {
        TextIO.readFile(filePath);
        //read the first line and ignore
        String line = TextIO.getln();
        System.out.println(line);


        double maxMonthlyRainfall = 0.0;
        while (!TextIO.eof()) {
            String[] record = TextIO.getln().trim().split(",");
            if (maxMonthlyRainfall < Double.parseDouble(record[2])) {
                maxMonthlyRainfall = Double.parseDouble(record[2]);
            }
        }
        return maxMonthlyRainfall;
    }

    long getNumOfRecords(String filePath) {
        TextIO.readFile(FILE_PATH);
        TextIO.getln();
        int numOfRecords = 0;
        while (!TextIO.eof()) {
            TextIO.getln();
            numOfRecords++;
        }

        return numOfRecords;
    }

    private static void verticalLine(GraphicsContext g, double height, double barWidth, int numOfRecords) {
        for (int i = 0; i < numOfRecords; i++) {
            g.strokeLine(margin + (barWidth * i), margin, margin + (barWidth * i), height - margin);

        }
    }


    //------ Implementation details: DO NOT EDIT THIS ------
    @Override
    public void start(Stage stage) {
        int width = 218 * 6 + 40;
        int height = 500;
        Canvas canvas = new Canvas(width, height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Rainfall Visualiser");
        stage.show();
        stage.setResizable(false);
    }

    class VerticalPanel extends JPanel {

        public VerticalPanel() {
            setPreferredSize(new Dimension(25, 0));
        }

        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);

            Graphics2D gg = (Graphics2D) g;
            gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Font font = new Font("Arial", Font.PLAIN, 15);

            String string = "MaxRainfall (mm)";

            FontMetrics metrics = g.getFontMetrics(font);
            int width = metrics.stringWidth(string);
            int height = metrics.getHeight();

            gg.setFont(font);


//            drawRotate(gg, getWidth(), (getHeight() + width) / 2, 270, string);
        }

        public static void main(String[] args) {
            launch();

        }
    }
}