class Methodoverriding{
Public static void main(String arg[]){
Varam v=new Varam();
m.m1();
m.m2();
m.m3();
murali m=new murali();
m.m4();
m.m5();
}
}
class Varam{
public void m1()
 { 
System.out.println("Helping nature");
 }
public void m2()
 { 
System.out.println("Talking well with everyone");
 }
public void m3()
 {
System.out.println("Giving respect to all");
 }
}
class murali extends Varam{
public void m4()
 {
System.out.println("Hard working");
 }
public void m5()
 {
System.out.println("responsibility");
 }
public void m3()
 {
System.out.println("always happy");
 }
}