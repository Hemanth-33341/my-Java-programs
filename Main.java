import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[][][]=new int [2][4][5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a[i].length;i++)
        {
            for(int j=0;j<a[j].length;j++)
            {
                for(int k=0;k<a[k].length;k++)
                {
                    System.out.println("block "+i+" school "+j+" class "+k);
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        for (int i=0;i<a[i].length;i++)
        {
            for(int j=0;j<a[j].length;j++)
            {
                for(int k=0;k<a[k].length;k++)
                {
                    System.out.println(a[i][j][k]);
                }
            }
        }
    }
	}


