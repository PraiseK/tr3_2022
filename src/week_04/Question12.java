package week_04;

public class Question12 {
    public static void main(String[] args) {
        System.out.println(smallest(3, 4, 5));
        System.out.println(smallest(3, 5, 4));
        System.out.println(smallest(5, 4, 3));
        System.out.println(smallest(4, 3, 5));
        System.out.println(smallest(3, 3, 3));

    }
    static int smallest(int x, int y, int z){
        int smallestNum = x;
        if (smallestNum > y){
            smallestNum = y;
        }
        if (smallestNum > z){
            smallestNum = z;
        }

        return  smallestNum;
    }
}
