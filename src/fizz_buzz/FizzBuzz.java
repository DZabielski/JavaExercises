package fizz_buzz;

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if ((i % 2) == 0 && (i % 3) == 0 && i != 0) {System.out.println(i + " FizzBuzz");}
            else if ((i % 2) == 0 && i != 0) {System.out.println(i + " Fizz");}
            else if ((i % 3) == 0 && i != 0) {System.out.println(i + " Buzz");}
            // if you need more, add next "else if" with new condition here

            else {System.out.println(i);}

        }
    }
}
