class number
{
    public static void main(String args[])
    {
        int i;
        int j;
        int count=1;
        for (i=1;i<6;i++)
        {
            for (j=1;j<6;j++)
            {
                if (count<10)
                {
                    System.out.print(0);
                }
                System.out.print(count+" ");
                count=count+=1;
            }
            
            System.out.println();
        }
    }
}