class goods
{
    public void stationary()
    {
        System.out.println("pen,book,slate pencil");
    }
    public int Mobile(int cost)
    {
        if(cost<20000)
        {
            System.out.println("Redmi");
        }
        else{
            System.out.println("Apple I phone");
        }
        return 0;
    }
}
public class Method {
    public static void main(String args[])
    {
    goods G=new goods();
    G.stationary();
    G.Mobile(1000); 
    }
}