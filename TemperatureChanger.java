import java.util.Scanner;
public class TemperatureChanger  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choosing;
        System.out.print("Which one do you want to use?(Enter Number)\n1. Change Fahrenheit to Celsius\n2. Change Celsius ti Fahrenheit");
        choosing = input.next();
        double F, C;
        if (choosing.equals("1")){
            System.out.print("Enter the temperature in degrees Fahrenheit:");
            F = input.nextDouble();
            C = (F - 32) * 1.8;
            System.out.println("Temperature in Celsius:\n"+C);
        }
        else if(choosing.equals("2")){
            System.out.print("Enter the temperature in degrees Celsius:");
            C = input.nextDouble();
            F = (1.8 * C ) + 32 ;
            System.out.println("Temperature in Fahrenheit:\n"+ F);
        } else{
            System.out.println("Please choose \"1\" or \"2\". ");
        }
        input.close();
    }
}
