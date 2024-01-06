package Day2;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        byte randomDigit = (byte)random.nextInt(10);
        for (int i = 1; i < 10; i++) {
            byte result = (byte)(randomDigit * i);
            System.out.println(randomDigit + " x " + i + " = " + result);
        }

    }
}
