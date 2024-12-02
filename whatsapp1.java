import java.util.*;
class Whatsapp1
{

public void send(String a, String b)
{
System.out.println("message");
}
public void send(String a, String b, String c)
{
System.out.println("videos");
}
public void send(String z)
{
System.out.println("photoes");
}
public void send(int x, String y)
{
System.out.println("doccuments");
}
public void send(int x, int y)
{
System.out.println("links");
}
public static void main(String args[])
{
System.out.println("process of sending details");
Whatsapp1 a=new Whatsapp1();
a.send("rakesh","ram");
a.send("balaji","ravi","ramesh");
a.send("suresh");
a.send(20,"rakesh");
a.send(10,20);
}

}

