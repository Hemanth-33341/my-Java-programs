class mirrortriangle {
    public static void main(String args[])
    {
        int i;
        int j;
        int k;
        int n=5;
        for (i=0;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<n-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
