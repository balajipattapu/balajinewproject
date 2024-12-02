class Consructor
{
public static void main(String args[])
 {
  Con c=new Con();
  Con c1=new Con(12);
  Con c2=new Con(12,"bala");
  Con c3=new Con(12,"bala",8.5);
  }
}
class Con
{
 Con()
  {
   System.out.println("hi");
  }
 Con(int i)
  {
   System.out.println("java");
  }
 Con(int i,String s)
  {
  System.out.println("wellcome");
  }
 Con(int i,String s,Double b)
  {
  System.out.println(".net");
  }
}
