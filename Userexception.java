class MyException extends Exceptions
{
  Myexception()
  {
    System.out.println("this voting is only 21 years above peoples");
  }
} 
  class UserException
  {
   public static void main(String args[])throws Exception
   {
    int age=21;
    if(age<21)
       throw new MyException();
   }
}
   
 