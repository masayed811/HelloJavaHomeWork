import java.util.Scanner;

public class PracticsCondition {
    public static void main(String[] args) {
       // int a = 33;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter te first integer number");
        int a = scanner.nextInt();


        if(a%2 == 0){
            System.out.println("even number");

        }
        else{
            System.out.println("odd nuber");

        }
    }
}
