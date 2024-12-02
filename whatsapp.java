class method_overloading
{
public static void main(String args[])
{
System.out.println("process of sending details");
whatapp a=new whatapp();
a.send(10,"ram");
a.send(20,"ravi","ramesh");
a.send("ramesh");
a.send("rakesh","suresh");
a.send("50","10");
}

class whatsapp
{
public void send(int a, String b)
{
System.out.println("message");
}
public void send(int a, String b, String c)
{
System.out.println("videos");
}
public void send(String z)
{
System.out.println("photoes");
}
public void send(String a, String a)
{
System.out.println("doccuments");
}
public void send(int a, int a)
{
System.out.println("links");
}
}

}
