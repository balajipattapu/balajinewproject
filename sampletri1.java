import java.util.*;
class sampletri1
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
for(int i=1;i<=n;i++)
{

for(int j=1;j<i;j++)
{

System.out.print(" ");
}
for(int k=n;k>=i;k--)
{
System.out.print("*");
}
for(int l=n;l>=i;l--)
{
System.out.print("*");
}
System.out.println(" ");
}

}

}
