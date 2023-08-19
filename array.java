class array {
    public static void main(String args[])
    {
        int arra[][]=new int [3][4];

            for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                arra[i][j]=(int)(Math.random()*10);
            }
        }


        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arra[i][j]+" ");
            }
            System.out.println();
        }

        for(int n[]:arra) /*Here n is taking arra array by single dimension */
        {
            for (int m:n) /*Here m is taking the n by fetching each element */
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }  
    }
    
}
