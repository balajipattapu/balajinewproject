import java.util.*;
class rightangletriangle
{
public static void main(String args[])
{
System.out.println("how many rows you need ra balaji");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println("");
}
}}