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

    public void leapYear(){
        System.out.println("Enter the Year : ");
        int year = input.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" is a leap year");
                }
                else{
                    System.out.println(year+" is not a leap year");
                }
            }
            else{
                System.out.println(year+" is a leap year");
            }
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }

    public void largestOfThreeNumbers(){
        System.out.println("Enter the Three Numbers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if(number1>number2){
            if(number1>number3){
                System.out.println(number1+" is greater than "+number2+" and "+number3);
            }
        }
        else if(number2>number3){
            System.out.println(number2+" is greater than "+number1+" and "+number3);
        }
        else{
            System.out.println(number3+" is greater than "+number1+" and "+number2);
        }
    }


}
