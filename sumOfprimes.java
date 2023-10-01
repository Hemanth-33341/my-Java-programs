import java.util.Scanner;
public class sumOfprimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many primes you want to add");
        int input=sc.nextInt();
        int sum=0;
        int temp=0;
        int count=0;
        int i=0;

        while(temp==input)
        {
            for(int j=2;j<i;j++)
            {
                if(j%i==0)
                {
                    count=count+1;
                }
            }
            if(count==0)
            {
                sum=sum+i;
                temp=temp+1;
                i=i+1;
            }
        }
        System.out.println(sum);
    }
}
