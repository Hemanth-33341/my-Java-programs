class calculator{
    public int add(int n1,int n2)
    {
    int result=n1+n2;
    System.out.println("Result is:- "+result);
    return result;
    }

    public int sub(int n1,int n2)
    {
        int result=n1-n2;
        System.out.println("Result is:- "+ result);
        return result;
    }
}
public class creating_method
{
public static void main(String args[])
{
    int num1=100;
    int num2=15;
    calculator calc=new calculator();
    calc.add(num1,num2);
    calc.sub(num1,num2);
}
}
