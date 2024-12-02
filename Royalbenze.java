class Royalbenze
{
   public static void main(String [] args) throws InvalidotpNoException
   {
      A a = new A();
      String s = a.checkStatus(56);
      System.out.println(s);
   }
}
class InvalidotpNoException extends Exception
{
    InvalidotpNoException(String e)
    {
         super(e);
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
            InvalidotpNoException e = new InvalidotpNoException("in valid number"); 
            throw e;
         }
         return String;
   }
}