import java.util.*;
class Methodover_loading
{
public static void main(String args[])
 {
    Methodover_loading a=new Methodover_loading();
    a.m1();
    a.m1(20,3.5);
    a.m1(30,"ram",30);
    a.m1("balu","ram",2.5);
}
 public void m1()
   {
   System.out.println("hii");
   }

public void m1(int x, double s)
{
 System.out.println("hello");
}

 public void m1(int y,String x,int z)
{
 System.out.println("java");
}

 public void m1(String s,String a,float m)
{ 
 System.out.println("wellcome");
}

}

 