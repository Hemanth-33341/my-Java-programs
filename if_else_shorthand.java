class if_else_shorthand
{
    public static void main(String args[])
    {
// program to check the given integer is even or odd by using terenary operator
        int n=20;
        if (n%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        int num=5;
        System.out.println(num%2==0?"hai" : "bye");
// program to find the greatest between 3 integers by using terenary operator
        int a=10;
        int b=20;
        int c=30;
        System.out.println((a>b) ? (a>c?"a is greater":"c is greater"):b>c?"b is greater":"c is greater");
    }
}                       