import java.util.Scanner;
public class strrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        while (inp>0)
        {
            System.out.print(inp%10);
            inp=inp/10;
        } sc.close();
    }
}


        