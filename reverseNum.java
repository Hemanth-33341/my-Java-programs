import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int input=sc.nextInt();
        int input1=input;
        int sum=0;
        while (input>0)
        {
            int temp=input%10;
            sum=(sum*10)+temp;
            input=input/10;
        }
        if(input1==sum)
        {
            System.out.println(" This is Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }   sc.close();
}
}