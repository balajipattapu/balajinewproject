class MyThread extends Thread
{
  public void run()
  {
   for(int i=1;i<=10;i++)
     { 
       System.out.println(i);
     }
  }
} 
 class Main
 {
  public static void main(String args[])
  {
   Thread t=new Thread();
   System.out.println(t);
   
   MyThread b=new MyThread();
   Thread t1= new Thread(b);
    t1.setName("bala");
   System.out.println(""+t1+""+Thread.currentThread().getName());
   t1.start();
 
   MyThread b1=new MyThread();
   Thread t2=new Thread(b1);
   t2.setName("balu");
   System.out.println(t2);
   System.out.println(""+t1+""+Thread.currentThread().getName());
   t2.start();

   MyThread b2=new MyThread();
   Thread t3=new Thread(b2);
   t3.setName("balaji varma");
   System.out.println(""+t1+""+Thread.currentThread().getName());
   System.out.println(t3);
   t3.start();
 }
}

  
  
 
  
 

 
      