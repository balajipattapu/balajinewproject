class excep
{
   public static void main(String [] args) throws InvalidotpNoException
   {
      A a = new A();
      String s = a.checkStatus(20);
      System.out.println(s);
   }
}
class InvalidotpNoException extends Exception
{
    InvalidotpNoException(String a)
    {
         super(a);
    }
}
class A
{
    String String = null;
    public String checkStatus(int num) throws InvalidotpNoException
    {
         if (num == 1234)
         {
            String = "valid";
         }
         else if (num == 5678)
         {
            String = "valid";
         }
         else
         {
            InvalidotpNoException a = new InvalidotpNoException("invalid"); 
            throw a;
         }
         return String;
   }
}