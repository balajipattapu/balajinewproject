abstract class Cgovt
{
 public void m1()
 {
  System.out.println("close the everyone");
 }
 public abstract void m2();
 public abstract void m3();
}


class Ap extends Cgovt
{
 public void m2()
 {
  System.out.println("close schools only");
 }
public void m3()
{
 System.out.println("close colleges only");
}
}


class Centralgovt
{
 public static  void main(String args[])
{ 
 Ap ap=new Ap();
 ap.m1();
 ap.m2();
 ap.m3();
}
}