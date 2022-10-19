import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int a = input.nextInt();
        int max = 1, min =1;

        for (int i=1; i<=a;i++) {

            System.out.print("Enter Number "+ i +": ");
            int b = input.nextInt();
            if (i==1){
                max = b;
                min = b;

            }
             if (b>max){
                 max = b;
             }
             if (b<min){
                 min = b;
             }

        }
        System.out.println("The biggest one: " + max);
        System.out.println("The smaller one: " + min);

    }
}