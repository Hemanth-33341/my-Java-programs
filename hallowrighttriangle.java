class hallowrighttriangle {
    public static void main(String args[])
    {
        int i;
        int j;
        for (i=0;i<5;i++)
        {
            for (j=0;j<5;j++)
            {
                if(i==4 || j==4 || (i+j==4))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
    
}
