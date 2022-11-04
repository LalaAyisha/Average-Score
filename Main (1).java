
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Double Average;

        System.out.print("enter a number");
        double number= sc.nextInt();
        System.out.println();


        System.out.print("enter a number");
        System.out.println();
        double number2= sc.nextInt();

        System.out.print("enter a number");
        System.out.println();
        double number3= sc.nextInt();

        Average = (number+ number2+ number3)/3;
        System.out.println(Average);
        if (Average >95 )
            System.out.print("Congratulation you obtain a higher score");
        else
            System.out.print("try again");












    }
}