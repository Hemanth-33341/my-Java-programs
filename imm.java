import java.util.Scanner;
public class imm {
    public static void main(String args[])
    {
        int count =0;
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        for(int i=1;count<6;i++)
        {
            if(i%input==0)
            {
                System.out.println(i);
                count=count+1;
            }
        }
        sc.close();
    }
}
