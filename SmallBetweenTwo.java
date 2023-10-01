class Calculation
{
    public void calc(int a,int b,int c)
    {
        if ((a<b && a>c) ||(a>b&&a<c))
        {
            System.out.println("A is second smallest");
        }
        else if ((b>a && b<c) ||(b<a&&b>c))
        {
            System.out.println("B is second smallest");
        }
        else
        {
            System.out.println("C is the second smallest");
        }
    }
}
public class SmallBetweenTwo
{
    public static void main(String[] args) {
        Calculation C=new Calculation();
        C.calc(25,37,29);
        
    }
}
