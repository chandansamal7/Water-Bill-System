import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter litre: ");

        int w = sc.nextInt();

        System.out.println(Solution.waterBill(w));
    }
}