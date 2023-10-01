import java.util.Scanner;

public class gptcorrectedcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        LengthCheck l = new LengthCheck();
        int result = 0;
        int num_length = l.check(input);
        int dividend = num_length / 2;

        int first_two_digit = (int) (input / (Math.pow(10, dividend)));

        if (num_length % 2 == 0) {
            int reversed_first_two = 0;
            int temp = first_two_digit; // Store the value of first_two_digit in a temporary variable
            while (temp > 0) {
                int digit = temp % 10;
                reversed_first_two = (reversed_first_two * 10) + digit;
                temp = temp / 10;
            }

            int last_two_digits = input - (first_two_digit * (int) Math.pow(10, dividend));

            result = (reversed_first_two * (int) Math.pow(10, dividend)) + last_two_digits;
            System.out.println(result);
        } else {
            System.out.println("Enter an even digit number.");
        }
    }
}

class LengthCheck {
    int check(int a) {
        String String_converter = Integer.toString(a);
        int lengthh = String_converter.length();
        return lengthh;
    }
}

