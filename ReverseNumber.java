import java.util.Scanner;
class ReverseNumber{
public static void main(String args[])
{
System.out.println("enter a value");
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int reminder,rev=0;
while(n!=0)
{
reminder=n%10;
rev=rev*10+reminder;
n=n/10;
}
System.out.println(rev);
}
}
