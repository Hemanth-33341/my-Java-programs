import java.util.Scanner;
public class half {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        length_check l=new length_check();
        int result=0;
        int num_length=l.check(input);
        int dividend=num_length/2;
        

        int first_two_digit=(int) (input/(Math.pow(10,dividend)));
        int temp=first_two_digit;

        if(num_length%2==0)
        {
            int reversed_first_two=0;
            while(first_two_digit>0)
            {
                first_two_digit=first_two_digit%10;
                reversed_first_two=(reversed_first_two*10)+first_two_digit;
                first_two_digit=first_two_digit/10;
            }

        int last_two_digits=input-temp*((int)Math.pow(10,dividend));

        result=(reversed_first_two*(int)Math.pow(10,dividend))+last_two_digits;
        System.out.println(result);
        }
        else{
            System.out.println("enter even digited number");
        }
    }
    
}

class length_check
{
    int check(int a)
    {
        String String_converter=Integer.toString(a);
        int lengthh=String_converter.length();
        return lengthh;
    }
}
