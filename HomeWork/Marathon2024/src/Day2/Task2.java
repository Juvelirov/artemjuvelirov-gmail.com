package Day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startBorder = scanner.nextInt();
        int endBorder = scanner.nextInt();
        for (int i = startBorder + 1; i < endBorder; i++) {
            if((i % 5 == 0) && (i % 10 != 0)){
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
