class avg
{
    public static int calc(int a,int b,int c)
    {
        return (a+b+c)/3;
    }
}

class average
{
    public static void main(String[] args) {
        avg avg=new avg();
        System.out.println((double)avg.calc(25,45,65));
    }
}