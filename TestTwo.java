import java.util.Scanner;

public class TestTwo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        String a = in.nextLine();

        System.out.print("Input b: ");
        String b = in.nextLine();
        if (a.equals(b)){
            System.out.println("Строки идентичны");
        }
        else{
            System.out.println("Строки неидентичны");
        }
        in.close();
    }
}