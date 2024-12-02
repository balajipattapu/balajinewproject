import java.util.*;
public class MyMarks
{
public static void main(String []args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the marks");
int marks=sc.nextInt();
sc.close();
if(marks<35)
{
System.out.println("you fail");
}
else if(marks==35)
System.out.println("you gte just pass marks");
}
else if((marks>35) && (marks<=65))
{
System.out.println("you get d grade");
}
else if((marks>55) && (marks<=75))
{
System.out.println("you get c grade");
}

else if((marks>=75) && (marks<=85))
{
System.out.println("you get b grade");
}

else if((marks>85) && (marks<=92))
{
System.out.println("you get a grade");
}
else
{
System.out.println("you get a+ grade");
}
}
}

