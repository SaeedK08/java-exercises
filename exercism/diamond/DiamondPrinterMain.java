package diamond;
import java.util.Scanner;

public class DiamondPrinterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter to shape its diamond");
        String input = scanner.nextLine();
        DiamondPrinter diamond = new DiamondPrinter();
        char[][] list = diamond.formShape(input.charAt(0));
        for(int i = 0; i < list.length; i++)    System.out.println(list[i]);
    }
}