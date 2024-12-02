import java.util.*;
interface Sai
{
default void method1()
{
System.out.println("read a code");
}
}

interface Balaji
{
default void method2()
{
System.out.println("write  a code");
}
}

interface Kiran
{
default void method3()
{
System.out.println(" manage code");
}
}

interface Sathish
{
default void method4()
{
System.out.println("Update  a code");
}
}

class Most implements Sathish,Kiran,Balaji,Sai
{
public static void main(String args[])
{
Most obj= new Most();
obj.method1();
obj.method2();
obj.method3();
obj.method4();
}
}




