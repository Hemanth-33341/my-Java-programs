class prime
{
    public static void main(String args[])
    {
    int n=17;
    int count=0;
    for(int i=2;i<9;i++)
    {
        if (n%i==0)
        {
            count=count+1;
        }
    }

    if (count==0)
    {
        System.out.println("prime");
    }
    else
    {
        System.out.println("Not prime");
    }
}
}
