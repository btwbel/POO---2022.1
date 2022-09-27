package questao1;
import java.util.Locale;
import java.util.Scanner;

public class Dollar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        double amount = sc.nextDouble();


        double total = (dollarPrice*amount) + (dollarPrice*amount) * (0.06);
        System.out.printf("Amount to be paid in reais = %.2f%n", total);
        sc.close();