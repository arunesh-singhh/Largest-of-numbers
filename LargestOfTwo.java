import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();

        if(a > b){
            System.out.println("first number is greater");
        }
        else{
            System.out.println("second number is greater");
        }
    }
}
