import java.util.*;
class Tests1
{
public static void main(String args[])
{
System.out.println("enter any value");

Scanner Sc=new Scanner(System.in);
int n =Sc.nextInt();


if(n <= 35)
{
System.out.println("grade e");
}

for(n=36;n>=50;n++)
{
System.out.println("grade d"+n);
}
for(n=51;n>=60;n++)
{
System.out.println("grade c");
}
for(n=61;n>=80;n++)
{
System.out.println("grade b");
}

}
}