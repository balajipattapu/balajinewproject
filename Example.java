import java.util.*;
class example
{
  int number;
  String name;
  
 public void setnumber( int number)
 {
  this.number=number;
 }
public void setname(String name)
 {
  this.name=name;
 }
public int getnumber()
 {
  return number;
}
public String getname()
 {
  return name;
}
public void printdetails()
{
 System.out.println("number is:"+number);
 System.out.println("name is:"+name);
}
}

class Example
{
 public static void main(String args[])
 {
 example e=new example();
         e.setnumber(8247540);
         e.setname("balaji");
         e.printdetails();
 }
}