import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        calc c=new calc();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int input=sc.nextInt();
        System.out.println(c.Calculation(input));
    }
}
class calc{
    int Calculation(int a)
    {
        int sum=0;
        while (a>0)
        {
            int temp=a%10;
            sum=sum+temp;
            a=a/10;
        }
    return sum;
    }
}
