class Brothers
{
 public static void(String args[])
 {
  brothers b1=new brothers();
  brothers b2=new brothers();
  brothers b3=new brothers();
 
  b1.setid(01);
  b1.setname("Sairam");
  b1.nickname("rowdy boy");
  b1.adress("Samathamallam");

  b2.setid(02);
  b2.setname("Vamsi krishna");
  b2.setnickname("lover boy");
  b2.adress("samanthamallam");

  b3.setid(03);
  b3.setname("Sandeep");
  b3.setnickname("smart boy");
  b3.set adress("samanthamallam");

System.out.println("id is      :"+b1.getid());
System.out.println("Nme is     :"+b1.getname());
System.out.println("nickname is:"+b1.getnickname());
System.out.println("adress is  :"+b1.getadress());

System.out.println("id is      :"+b2.getid());
System.out.println("Nme is     :"+b2.getname());
System.out.println("nickname is:"+b2.getnickname());
System.out.println("adress is  :"+b2.getadress());

System.out.println("id is      :"+b3.getid());
System.out.println("Nme is     :"+b3.getname());
System.out.println("nickname is:"+b3.getnickname());
System.out.println("adress is  :"+b3.getadress());

}
}
class Bros
{
int id;
String name;
String nickname;
String adress;

 private void setid(int id)
{ 
 this.id=id;
}
 private void setname(String name)
{
  this.name=name;
}
private void setnicname(String nickname)
{
  this.nickname;
}
private void setadress(String adress)
{
  this.adress;
}
private int getid()
 {
  return id;
 }	
private String getname()
 {
   return name;
 }
private String getnickname()
 {
  return nickname;
 }
private String getadress()
 {
 return adress;
 }
}







 