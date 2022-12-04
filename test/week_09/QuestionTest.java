package week_09;

import org.junit.jupiter.api.Test;

class QuestionTest {
    @Test
    void testToString1() {
        String question = "Question: \n" +
                "Web pages are made using HTML - what does it stand for?";
        System.out.print(question);

        String[] choices = {"HyperText Markup Language\n" , "Hyper Tough Makeup Language\n" , "HyperText Madeup Language\n", "Hard to Makeout Text"};
        System.out.println(choices);

        int answerIndex = 2;

        Question myQuestion = new Question(question, choices, 2);

        System.out.println(myQuestion);
    }
}