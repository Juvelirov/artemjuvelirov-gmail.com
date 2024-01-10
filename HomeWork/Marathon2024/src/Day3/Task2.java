package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // this solution needs to be fixed
        Scanner scan = new Scanner(System.in);
        while(true){
            double numerator = scan.nextDouble();
            double denumerator = scan.nextDouble();
            if(denumerator == 0){
                break;
            }
            System.out.println(numerator / denumerator);
        }
    }
}
