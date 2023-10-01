import java.util.Scanner;
class tables
{
    public static void main(String[] args) {
        System.out.println("Enter the table you want :");
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        System.out.println("processing.......");
        calc c=new calc();
        c.calculator(inp);
        sc.close();
    }
}
class calc
{
    void calculator(int a)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(a +" " + "X" +" " + i + " " + " " + "=" + " " + a*i);
        }
    }
}