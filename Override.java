class Constructoroverriding
{
  Constructoroverriding()
 { 
   System.out.println("hii");
 }
 public void m1(int i)
 {
  System.out.println("java");
 }
 static
 {
  System.out.println("ucuu");
 }
}

 class Overriding extends Constructoroverriding
{
  Overriding()
 {
 System.out.println("python");
 }
 public void m1(int i)
 {
  System.out.println("second java");
 }

 }


 class Override
{
 public static void main(String args[])
 { 

  
  Overriding r=new Overriding();
   r.m1(1);


  
}
}
  
  
