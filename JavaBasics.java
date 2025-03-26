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

    public void largestOfThreeNumbers() {
        System.out.println("Enter the Three Numbers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println(number1 + " is greater than " + number2 + " and " + number3);
            }
        } else if (number2 > number3) {
            System.out.println(number2 + " is greater than " + number1 + " and " + number3);
        } else {
            System.out.println(number3 + " is greater than " + number1 + " and " + number2);
        }
    }

    public void addComplexNumbers(){
        System.out.println("Enter the two complex Numbers : ");
        System.out.println("Enter the first real and Imaginary values : ");
        int real1= input.nextInt();
        int img1= input.nextInt();
        System.out.println("Enter The Second Real and Imaginary values : ");
        int real2 = input.nextInt();
        int img2 = input.nextInt();
        int realSum = real1+real2;
        int imgSum = img1+img2;
        System.out.println("The Sum of Two ComplexNumbers is  : "+realSum+" + "+imgSum+"i");
    }

    public void simpleInterest(){
        System.out.println("Enter the Principle time and rate values : ");
        double principle = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();

        double simple_interest = (principle*time*rate)/100;
        System.out.println("The Simple Ineterest is  : "+simple_interest);
    }

    public void perimeterRectangle(){
        System.out.println("Enter the Length and Breadth os the Rectangle : ");
        int length = input.nextInt();
        int breadth = input.nextInt();
        int perimeterRectangle = 2*(length+breadth);
        System.out.println("The Perimeter of the Rectangle is  : "+perimeterRectangle);
    }

    public void lcmAndHcf(){
        System.out.println("Enter the Numbers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int hcf = 1;
        for(int i=1;i<=number1 && i<=number2;i++){
            if(number1%i==0 && number2%i==0){
                hcf = i;
            }
        }
        System.out.println("The LCM is "+(number1*number2)/hcf);
        System.out.println("The HCF is "+hcf);
    }

    public void Factorial(){
        System.out.println("Enter the Number " );
        int number = input.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("The Factorial of the Number is "+fact);
    }

    public void fibonacci(){
        System.out.println("Enter the Number " );
        int number = input.nextInt();
        int fact1 = 0;
        int fact2 = 1;
        int next;
        System.out.println("The Fibonacci Series is  : ");
        System.out.print(fact1+" "+fact2+" ");
        for(int i=2;i<number;i++){
            next = fact1+fact2;
            System.out.print(next+" ");
            fact1 =fact2;
            fact2 = next;
        }
    }
}
