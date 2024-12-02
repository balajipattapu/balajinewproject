class Consructorsetget
{
public static void main(String args[]) 
 {
  prudhvi p=new prudhvi();
  p.p1(1);
  p.p2("Realme");
  p.p3("6Gb");
  p.p4("64GB");
  p.p5("50mp");
  p5.printvalues();
}
}
class prudhvi
{ 
 int id;
 String name;
 String rom;
 String ram;
 Strinclsg camera;
 prudhvi(int id,String name,String rom,String ram,String camera)
 {
  this.id = id;
  this.name = name;
  this.rom = rom;
  this.camera = camera;
  this.ram= ram;
  public void printvalues()
 {
  System.out.println("int id="+id);
  System.out.println("String name="+name);
  System.out.println("String processor="+processor);
  System.out.println("String ram="+ram);
  System.out.println("Strnig camera="+camera);
}
}
}
