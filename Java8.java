import java.util.ArrayList;
import java.util.Comparator;
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

    //Method for reading List of Strings from User
    public List<String> readListOfString(){
        List<String> list = new ArrayList<>();
        int size;
        System.out.println("Enter the Size of the Array : ");
        size = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Array Element : ");
        for(int i=0;i<size;i++){
            String value = input.nextLine();
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


    //Print The Courses whcih contains Spring in that
    //prints all the Odd Numbers in the List using streams
    public void printAllOddNumbersInList(){
        List<Integer> list = readListofNumbers();
        System.out.println("Odd Numbers in the List is  : ");
        list.stream()
                .filter(number->number%2!=0)
                .forEach(System.out::println);
    }

    //prints the All the courses
    public void printAllCourses(){
        List<String>list=  readListOfString();
        System.out.println("Enter Courses are : ");
        list.stream()
                .forEach(System.out::println);
    }


    //Prints the Courses with contains Spring in that
    public void printCourse(){
        List<String> list = readListOfString();
        System.out.println("Courses which contains Spring in that");
        list.stream()
                .filter(courseName ->courseName.contains("Spring"))
                .forEach(System.out::println
                );
    }


    //Prints the Courses With more than 5 characters
    public void printCourseWith5Characters(){
        List<String> list = readListOfString();
        System.out.println("Courses Whoch contains more than 5 characters : ");
        list.stream()
                .filter(courseName ->courseName.length()>5)
                .forEach(System.out::println);

    }


    //prints the Sqaure of the Even Number in the List
    public void printSquaresofEvenNumber(){
        List<Integer> list = readListofNumbers();
        System.out.println("The Squares of Even Numbers : ");
        list.stream()
                .filter(number->number%2==0)
                .map(number->number*number)
                .forEach(System.out::println);
    }


    //Prints the Cube of Odd Numbers in the List
    public void printCubesOfOdd(){
        List<Integer> list = readListofNumbers();
        System.out.println("Cubes of the Odd Numbers  : ");
        list.stream()
                .filter(number->number%2!=0)
                .map(number->number*number*number)
                .forEach(System.out::println);
    }

    //Prints the Number of Characters in List
    public void printsNumberOfCharacters() {
        List<String> list = readListOfString();
        System.out.println("Numbers of Characters in Courses : ");
        list.stream()
                .map(courseName -> courseName + " : " + courseName.length())
                .forEach(System.out::println);
    }
    public void printDistinctValuesInList(){
        List<Integer> list = readListofNumbers();
        System.out.println("The Distinct Values are : ");
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public void printDistinctValuesInListAscending(){
        List<Integer> list = readListofNumbers();
        System.out.println("The Distinct Values in List in Ascending Order : ");
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
