import java.util.*;
class Brotherslove
{
 public static void main(String args[])
 {
  Bros b1=new Bros();
  Bros b2=new Bros();
  Bros b3=new Bros(); 
 
 
  b1.setid(01);
  b1.setname("Sairam");
  b1.setHero("Allu arjun");
  b1.setadress("Samathamallam");

  b2.setid(02);
  b2.setname("Vamsi krishna");
  b2.setHero("Mahesh babu");
  b2.setadress("samanthamallam");

  b3.setid(03);
  b3.setname("Sandeep");
  b3.setHero("Vijay dhevarakonda");
  b3.setadress("samanthamallam");

System.out.println("id is      :"+b1.getid());
System.out.println("Nme is     :"+b1.getname());
System.out.println("Nickname is:"+b1.getnickname());
System.out.println("adress is  :"+b1.getadress());

System.out.println("id is      :"+b2.getid());
System.out.println("Nme is     :"+b2.getname());
System.out.println("Nickname is:"+b3.getnickname());
System.out.println("adress is  :"+b2.getadress());

System.out.println("id is      :"+b3.getid());
System.out.println("Nme is     :"+b3.getname());
System.out.println("Nickname is:"+b3.getnickname());
System.out.println("adress is  :"+b3.getadress());

}
}
class Bros
{
int id;
String name;
String Hero;
String adress;

 public void setid(int id)
{ 
 this.id=id;
}
 public void setname(String name)
{
  this.name=name;
}
public void setHero(String Hero)
{
  this.Hero=Hero;
}
public void setadress(String adress)
{
  this.adress=adress;
}
public int getid()
 {
  return id;
 }
public String getname()
 {
   return name;
 }
public String getHero()
 {
  return Hero;
}
public String getadress()
 {
 return adress;
 }
}







 