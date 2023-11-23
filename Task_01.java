import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner  ( System.in);
        System.out.println("Enter any two numbers below and select any of the operation : ");
        double  num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Select the operations from * + - / %");
        String operation =sc.next() ;

        switch (operation){
            case "*" :
                System.out.println("The multiplication of the given numbers is : "+(num1*num2));
                break;
            case "+" :
                System.out.println("The addition of the given numbers is : "+(num1+num2));
                break;
            case "-" :
                System.out.println("The substraction of the given numbers is : "+(num1-num2));
                break;
            case "/" :
                System.out.println("The quotientG of the given numbers is : "+(num1/num2));
                break;
            case "%" :
                System.out.println("The reminder of the given numbers is : "+(num1%num2));
                break;


        }
    }
}
