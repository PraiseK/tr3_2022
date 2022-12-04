package assignment;

import textio.TextIO;

import java.util.Arrays;

public class RainfallAnalyser {

    /**
     * Author: Praise Kamusasa
     * Version:
     * Description:
     */
    //define constant
    private static  final String OUTPUT_HEADER = "year, month,total,min,max";

    public static void main(String[] args) {
        System.out.println("Enter a filename: ");
        String filename = TextIO.getln();
        try {
            TextIO.readFile(filename);
            System.out.println("reading successfully");
            //generate output file
            String outputFile = generateOutputFile(filename);
            //save total, min and max to output file
            generateMonthlyStatistics(filename);
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void generateMonthlyStatistics(String filename) {
        //read the first line and ignore it
        String line = TextIO.getln();
        TextIO.writeFile(filename);
        TextIO.putln(OUTPUT_HEADER);
        System.out.println(line);
        if (line == null){
            System.out.println("Empty file. Aborted.");
            return;
        }
        //starts extract methods
        int year = 0;
        byte current_month = 1;
        double totalMonthlyRainfall= 0.0;
        double minMonthlyRainfall = Double.MAX_VALUE;
        double MaxMonthlyRainfall= Double.MIN_VALUE;

                ;


        int numOfRecords = 0;
        String[] record;
        if(!TextIO.eof()) {
            line = TextIO.getln().trim();
            numOfRecords++;
            //extract info...
            record = line.split(",");
            //extract info
            //...
            //if currentMonth is different from month
            //then time to save one line to the output file
//            saveMonthlyRecord(year, current_month,)
        }

        while (!TextIO.eof()) {
            line = TextIO.getln().trim();
            numOfRecords++;
            record = line.split(",");

        }

        System.out.println(numOfRecords);



    }

    private static String generateOutputFile(String filename) {
        System.out.println("filename = " + filename);
        String[] filePath = filename.trim().split("\\.");
        //testing only
        String outputFile = filePath[0] + "_analysed.csv";
        System.out.println(Arrays.toString(filePath));
        return outputFile;
    }

}
