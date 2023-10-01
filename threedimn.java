import java.util.Scanner;
public class threedimn {
    public static void main(String args[])
    {
	int a[][][]= new int[2][][];
    a[0]=new int[3][4];
    a[1]=new int[4][3];
    
    a[0][0]=new int[2];
    a[0][1]=new int[3];
    a[0][2]=new int[5];
   

    a[1][0]=new int[5];
    a[1][1]=new int[4];
    a[1][2]=new int[3];
    a[1][3]=new int[2];

	Scanner sc=new Scanner(System.in);
    int i,j,k;
	for( i=0;i<a.length;i++)
	{
		for ( j=0;j<a[i].length;j++)
		{
			for(k=0;k<a[i][j].length;k++)
			{	System.out.print("enter the value of block "+i+"row "+j+"column"+"k");
				a[i][j][k]=sc.nextInt();
			}
            
		}
	}

	for( i=0;i<a.length;i++)
	{
		for ( j=0;j<a[i].length;j++)
		{
			for( k=0;k<a[i][j].length;k++)
			{	
                System.out.print(a[i][j][k]+" ");
			}
            System.out.println();
		}
        System.out.println();
	}
}
}