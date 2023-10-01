class gpt {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the first row and last row
            if (i == 1 || i == n) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                // Print star and spaces for the inner rows
                System.out.print("*");
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Print spaces and stars for the last line
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
    }
}