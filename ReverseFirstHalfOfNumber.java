public class ReverseFirstHalfOfNumber {
    public static void main(String[] args) {
        long number = 1234; // Replace with your desired number
        long reversedNumber = reverseFirstHalf(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static long reverseFirstHalf(long number) {
        int numberOfDigits = (int) Math.log10(number) + 1; // Calculate the number of digits
        int halfLength = numberOfDigits / 2; // Calculate the length of the first half

        long reversedHalf = 0;
        long remainingHalf = number;

        // Reverse the first half of the number
        for (int i = 0; i < halfLength; i++) {
            long digit = remainingHalf % 10;
            reversedHalf = reversedHalf * 10 + digit;
            remainingHalf /= 10;
        }

        // Combine the reversed first half with the second half
        long reversedNumber = reversedHalf * (long) Math.pow(10, halfLength) + remainingHalf;

        return reversedNumber;
    }
}
