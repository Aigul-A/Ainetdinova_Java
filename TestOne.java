import java.util.Scanner;

public class TestOne{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        System.out.print("Input b number: ");
        int b = in.nextInt();
        if(a>b){
            System.out.println("a > b");
        }
        else if(a<b){
            System.out.println("a < b");
        }
        else{
            System.out.println("a = b");
        }

        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        in.close();
    }
}