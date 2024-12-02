abstract class A
{
 public void m1()
 {
  System.out.println("java");
 }
 public void m2()
 {
  System.out.println("python");
 }
 public void m3()
 {
 System.out.println("javascript");
 }
 abstract void m4();
}


class B extends A
{
 public void m4()
 {
 System.out.println(".net");
 }
 public void m2()
 {
  System.out.println("html");
 }
 public void m5()
 {
 System.out.println("core java");
 } 
}


class Abstractexample
{
 public static void main(String args[])
{
 B b=new B();
 b.m1();
 b.m2();
 b.m3();
 b.m4();
 b.m5();
}
}





 