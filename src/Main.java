import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       int n, total=0;

        Scanner doa = new Scanner(System.in); //define scanner

        do{
            System.out.println("Enter the Number: "); //get value from user

            n = doa.nextInt();

            if (n%4 == 0) { //The rule for div. by 4 also applies to div. by n%2==0
                total += n;
            }
        } while (n%2==0); //continue as long as there is an even number

        System.out.println("Total: " + total);
    }
}

