import java.util.*;
 interface A
{
 default void show()
{
System.out.println("A entered value is interface");
}
}

interface B
{
default void display()
{
System.out.println("B entered value is interface");
}
}
interface C
{
default void stark()
{
System.out.println("c entered value is interface");
}
}

interface D extends A,B,C
{
default void pp()
{
System.out.println("D extends value");
}
}

class ABCD implements D
{
public static void main(String args[])
{
ABCD M=new ABCD();
M.show();
M.display();
M.stark();
M.pp();
}
}