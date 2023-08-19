class doublerightangletriangle 
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }


            for(int jj=1;jj<=5-i;jj++)
            {
                System.out.print("  ");
            }


            for(int jjj=1;jjj<=i;jjj++)
            {
                System.out.print("*");
            }
        System.out.println();

         }
    }   
}
