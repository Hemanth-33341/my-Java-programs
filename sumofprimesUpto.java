import java.util.Scanner;
class sumofprimesUpto {
        public static void main(String[] args) {
            int sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter upto which, you want the sum");
            int input=sc.nextInt();

            int i,j;
            for( i=2;i<input;i++)
            {
                int count=0;
                for( j=2;j<i;j++)
                {
                    if (i%j==0)
                    {
                        count=count+1;
                    }

                }
                if (count==0)
                {
                    sum=sum+i;
                }
            }
            System.out.println(sum);
            sc.close();
        }
}
