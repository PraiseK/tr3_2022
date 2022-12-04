package week_09;

import java.util.Arrays;

public class Question {
        private String question;
        private String[] choices = new String[4];

    @Override
    public String toString() {
        return "Question:\n" +
                question + "\n" +
                choices[0] +"\n" +
                choices[1] +"\n" +
                choices[2] +"\n" +
                choices[3] +"\n" +
                "Answer:\n" + choices[answerIndex] +"\n";

    }

    private int answerIndex = 0;

    public Question(String question, String[] choices, int answerIndex) {
        //preconditions : choices is an array of 4 strings
        this.question = question;
        this.choices = choices;
        this.answerIndex = answerIndex;
    }


    public void add(Question question) {
        question.add(question);
    }
}

