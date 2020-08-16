
import java.util.*;

public class main {
    public static void main(String[] args) {
        double result=0.0;

        Scanner object= new Scanner(System.in);

        System.out .println("Enter the First Number:- ");
        int num1=object.nextInt();
        System.out.println("Enter the Second Number:- ");
        int num2=object.nextInt();
        System.out.println("What Operation? ");
        char operator=object.next().charAt(0);

        switch(operator){

            case '+' : result = num1 + num2;
            break;
            case '-' : result = num1 - num2;
            break;
            case '*' : result = num1 * num2;
            break;
            case '/' : result = num1 / num2;
            break;
            default:
                System.out.println("The operator does't match");

        }
        System.out.println(num1+" "+operator+" "+num2+" = "+result);
    }


}
