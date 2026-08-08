import java.util.*;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temprature");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius*9/5)+32;

        int rounded = (int)Math.round(fahrenheit);

        System.out.println("Temprature in celsius "+celsius+ "c");
        System.out.println("Temprature in fahrenheit "+fahrenheit+ "f");
        System.out.println("Temprature in fahrenheit "+rounded+ "f");
    }
}