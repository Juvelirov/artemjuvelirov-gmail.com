package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // this solution needs to be fixed

        for (int i = 0; i < 5; i++) {
            double numerator = scan.nextDouble();
            double denumerator = scan.nextDouble();
            switch ((int)denumerator){
                case 0:
                    System.out.println("Деление на 0");
                    continue;
            }
            System.out.println(numerator / denumerator);
        }

    }
}
