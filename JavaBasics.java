import java.util.Scanner;

public class JavaBasics {

    Scanner input = new Scanner(System.in);

    public void printSomething(){
        System.out.println("Hello World");
    }

    public void evenOrOdd(){
        System.out.println("Enter the Number : ");
        int number = input.nextInt();
        if(number%2 == 0){
            System.out.println(number+" is a Even Number");
        }
        else{
            System.out.println(number+" is a Odd Number");
        }
    }

    public void swap_numbers(){
        System.out.println("Enter the Numbers  : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int temp;
        System.out.println("The Numbers before Swapping was  : "+number1+" and "+number2);

        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The Numbers After Swapping was  : "+number1+" and "+number2);
    }
}
