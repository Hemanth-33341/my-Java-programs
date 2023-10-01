import java.util.Scanner;
public class raisingoder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check");
        int input=sc.nextInt();
        int a[]=new int[3];
        for(int i=0;i<3;i++)
        {
            int l_digit=input%10;
            a[i]=l_digit;
            input=input/10;
        }
        for(int i=0;i<a.length-1;i++)
        {
            if (a[i]>a[i+1])
            {
                System.out.println("raising number");
                 break;
            }
            else{
                System.out.println("not a raising number");
                 break;
           }
        }   sc.close();
    }
}
