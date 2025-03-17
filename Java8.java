import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java8 {

    Scanner input = new Scanner(System.in);

    //Method for Reading List of Integer from User
    public List<Integer> readListofNumbers(){
        List<Integer> list = new ArrayList<>();
        int size;
        System.out.println("Enter the Size of the Array : ");
        size = input.nextInt();
        System.out.println("Enter the Array Element : ");
        for(int i=0;i<size;i++){
            int value = input.nextInt();
            list.add(value);
        }
        return list;
    }
    //Prints all the Numbers inside the Array using Streams
    public void printAllNumbersInArray(){
       List<Integer> list = readListofNumbers();
       System.out.println("The List of Numbers Are : ");
        list.stream()
                .forEach(System.out::println);
    }


    //Prints all the Even Numbers in the List using Streams
    public void printAllEvenNumbersInList(){
        List<Integer> list = readListofNumbers();
        System.out.println("The Even Numbers in the List is  : ");
        list.stream()
                .filter(number->number%2==0)
                .forEach(System.out::println);
    }


    //prints all the Odd Numbers in the List using streams
    public void printAllOddNumbersInList(){
        List<Integer> list = readListofNumbers();
        System.out.println("Odd Numbers in the List is  : ");
        list.stream()
                .filter(number->number%2!=0)
                .forEach(System.out::println);
    }

}
