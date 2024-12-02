class Methodoverloading
{
public static void main(String args[])
 {
    Methodoverloading a=new Methodoverloading();
    a.m1();
    a.m1(20,3.5);
    a.m1(30,"ram");
    a.m1("balu","ram");
}
 

 public void m1()
   {
   System.out.println("hii");
   }

public void m1(int x, float s)
{
 System.out.println("hello");
}

 public void m1(int y,String x)
{
 System.out.println("java");
}

 public void m1(String s,String a)
{ 
 System.out.println("wellcome");
}

}

 