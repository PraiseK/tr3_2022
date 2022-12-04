package week03;

public class exercise_2_2 {
    public static void main(String[] args) {
        int dice_1;
        int dice_2;
        int total_roll;
        dice_1 = (int)(Math.random()*6) + 1;
        dice_2 = (int)(Math.random()*6) + 1;
        total_roll = dice_1 + dice_2;
        System.out.println("The first die comes up " + dice_1);
        System.out.println("The second die comes up " + dice_2);
        System.out.println("The total roll is " + total_roll);


    }
}
