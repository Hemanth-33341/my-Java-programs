import java.util.Scanner;
class vowelsinstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String inp=sc.nextLine();
        calc c=new calc();
        int result=c.vowels(inp);
        System.out.println("no of vowels are "+ result);
    }
}

class calc
{
    public  int vowels(String inp)
    
    {   
        int count=0;
        
        for(int i=0;i<inp.length();i++)
        {
            if (inp.charAt(i)=='a'|| inp.charAt(i)=='e' || inp.charAt(i)=='i'|| inp.charAt(i)=='o'|| inp.charAt(i)=='u')
            {
                count=count+1;
            }
        }
        return count;
    }
}
