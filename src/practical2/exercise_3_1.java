package practical2;

public class exercise_3_1 {
    public static void main(String[] args) {
        int dice_1, dice_2;
        int countRolls;
        countRolls = 0;
        do {
            dice_1 = (int) (Math.random()*6)+ 1;
            dice_2 = (int) (Math.random()*6)+ 1;
            countRolls++;
        }while (dice_1 != 1|| dice_2 != 1);

        System.out.println("the pair of dice is rolled" + countRolls + "times till snake eyes");

    }
}
