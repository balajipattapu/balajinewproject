class Swappingtwonumbers1
{
 public static void main(String args[])
 {
  int a=10;
  int b=20;
  System.out.println("Before sorting two numbers:"+a+""+b);
   a=a+b;
   b=a-b;
   a=a-b;
  System.out.println("Before sorting two numbers:"+a+""+b);
}
}