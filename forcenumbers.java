import java.util.Scanner;

public class forcenumbers{
    public static void main(String[] args) {

        int n, k, i, total =1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Base Number : ");

        n = input.nextInt();

        System.out.print("Enter The Exponent Number : ");

        k = input.nextInt();


        for(i = 1; i <= k; i++){

            total *= n;

        }
        System.out.println("Conclusion : " + total);
    }
}
