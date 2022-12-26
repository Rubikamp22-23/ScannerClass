import java.util.Scanner;
public class Calculator{
    public static void main (String[] args) {
        //Scanner
        Scanner sc = new Scanner (System.in);
        //Getting first number
        System.out.print("First Number: ");
        double num1 = sc.nextDouble();
        //Getting first number
        System.out.print("Second Number: ");
        double num2 = sc.nextDouble();
        // Getting first operator
        System.out.print("Choose operator\"+ , - , * , /\":");
        String operator = sc.next();
        //Conditional commands
        //Plus 
        if (operator.equals("+")){
            System.out.println("Answer: "+ (num1 + num2));}
        //Minus 
        else if (operator.equals ("-")){
            System.out.println("Answer: "+ (num1 - num2));} 
        //Multiply
        else if (operator.equals("*")){
            System.out.println("Answer: "+ (num1 * num2));} 
        //Divide 
        else if (operator.equals("/")){
            System.out.println("Answer: "+ (num1 / num2));}
        //Anything but operators
        else{
            System.out.println(operator+" is wrong ... ");
        }
        sc.close();
    }
}