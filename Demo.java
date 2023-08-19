class student
{
    String name;
    int roll;
    double marks;
    
}

class Demo{
    public static void main(String args[])
    {
        student s1=new student();
        s1.name="Hemanth";
        s1.roll=453;
        s1.marks=7.3;       

        student s2=new student();
        s2.name="laxmi";
        s2.roll=454;
        s2.marks=8.5;   
        
        student s3=new student();
        s3.name="chandu";
        s3.roll=455;
        s3.marks=8.3;
        
        String arra[]={'name','roll','marks'}

        for(int i=0;i<arra.length;i++)
        {
            System.out.println(s1.arra[i]);
        }

        

    }
}

