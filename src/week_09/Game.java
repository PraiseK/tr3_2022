package week_09;

import java.util.ArrayList;

public class Game {
    ArrayList<Question> questions;
    int points;

    public Game(ArrayList<Question> questions, int points) {
        questions= new ArrayList<>();
        this.points = points;
    }
    public  void addQuestion(Question question){
        question.add(question);
    }




}
