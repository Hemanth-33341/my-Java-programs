import java.util.Arrays;
import java.util.Scanner;
public class ascof3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        gp g=new gp();
        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a<b && a<c) && (b<c)){
            System.out.println(a+","+b+","+c);
        }
        else if((a<b && a<c) && (b>c)){
            System.out.println(a+","+c+","+b);
        }
        else if((b<a && b<c)&& (a<c)){
            System.out.println(b+","+a+","+c);
        }
        else if((b<a && b<c)&& (a>c)){
            System.out.println(b+","+c+","+a);
        }
        else if((c<a && c<b) &&(a<b)){
            System.out.println(c+","+a+","+b);
        }
        else{
                System.out.println(c+","+b+","+a);
        }
        g.show();
        sc.close();
    }
}

 class gp
{
    void show()
    {
        Scanner scan=new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }
        
        Arrays.sort(nums);
        
        System.out.println("Ascending order: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
        scan.close();
    }
    }
