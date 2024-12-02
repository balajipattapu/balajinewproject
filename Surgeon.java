import java.util.*;
class Doctor1
{
public void hospital1()
{
System.out.println("salary=50000");
}
}
class Doctor2 extends Doctor1
{
public void hospital2()
{
System.out.println("salary=20000");
}
}
class Surgeon
{
public static void main(String[] args)
{
Doctor2 d=new Doctor2();
d.hospital2();
d.hospital1();

}
}

