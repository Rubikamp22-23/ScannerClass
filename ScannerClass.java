import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        // This is a very simple program. Just for learning Scanner :)
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner (System.in);
        String name= sc.next();
        System.out.println("Hello "+name + " joon :)");
        sc.close();
    }
}