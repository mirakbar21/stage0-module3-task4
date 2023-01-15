package lang.print.gaps.task4;
import java.util.Scanner;
public class FormulaCreator {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        float a = obj.nextFloat();
        float b = obj.nextFloat();
        System.out.println((9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));
    }
}
