import java.util.Scanner;
class sunil
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int input=sc.nextInt();
            String convert=Integer.toString(input);
            for(int i=0;i<convert.length();i++)
            {
                if (convert.charAt(i)=='3')
                {
                    int last_digit=input%10;
                    int first_two_digit=input/10;
                    int sum=0;
                    while(first_two_digit>0)
                    {
                        int temp=first_two_digit%10;
                        sum=sum+temp;
                        first_two_digit=first_two_digit/10;
                    }
                    if(sum>last_digit)
                    {
                        while (input>0)
                        {
                            int temparory=input%10;
                            if(temparory%7!=0)
                            {
                                input=input/10;
                            }
                            else
                            {
                                System.out.println("This is the special number");
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("This not a special number");
                    }
                }
            else if (convert.charAt(2)!='3')
            {
                System.out.println("Not a special number");
            }
            }    
    }
}