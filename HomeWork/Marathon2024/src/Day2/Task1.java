package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorCount = scanner.nextInt();
        if(floorCount <= 0){
            System.out.println("Ошибка ввода");
        }
        else if(floorCount <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if(floorCount >= 5 &&  floorCount <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else{
            System.out.println("Многоэтажный дом");
        }
        scanner.close();
    }
}
