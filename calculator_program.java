class Calci
{
    public int addition(int num1,int num2)
    {
        int result=num1+num2;
        System.out.println(result);
        return result;
    }

    public int subtraction(int num1,int num2)
    {   int result=num1-num2;
        System.out.println(result);
        return result;
    }

    public int multiplication(int num1,int num2)
    {        
        int result=num1*num2;
        System.out.println(result);
        return result;
    }

        public int division(int num1,int num2)
    {       
         int result=num1/num2;
         System.out.println(result);
         return result;
    }
}

public class calculator_program
{
    public static void main(String args[])
    {   int number1=30;
        int number2=40;
        Calci C=new Calci();
        C.addition(number1,number2);
        C.multiplication(5, 4);
        C.division(1000, 5);

    }
}
