package Domashnie;

public class Triangle_3_while {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 4) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }

            i++;

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();


        }
    }
}
