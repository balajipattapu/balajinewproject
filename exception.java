class exception
{
   public static void main(String [] args) throws InvalidotpNoException
   {
      Userex u= new Userex();
      String s = Userex.checkStatus(20);
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
class Userex
{
    String String = null;
    public String checkStatus(int num) throws InvalidotpNoException
    {
         if (num ==1234)
         {
            String = "valid";
         }
         else if (num == 5678)
         {
            String = "valid";
         }
         else
         {
            InvalidotpNoException a = new InvalidotpNoException("not valid"); 
            throw a;
         }
         return String;
   }
}