public class oddpyramid {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            for(int k=0;k<=10-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
