import java.util.*;

//function to print hello world
public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


// Language: java


//function to find exponent of a number
public class Exponent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Enter an exponent: ");
        int exp = input.nextInt();
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println(num + " to the power of " + exp + " is " + result);
    }
}