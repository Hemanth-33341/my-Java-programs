import java.util.Scanner;
class middlechar
{
         public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        int length=inp.length();

        if (length%2==0)
        {
            System.out.println("Middle char is : "+ inp.charAt((length/2)-1)+inp.charAt((length/2)));
        }
        else
        {
            System.out.println("middle character is : "+ inp.charAt(length/2));
        }
    }
}