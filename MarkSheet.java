import java.util.*;

public class MarkSheet {

	public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the marks");
 int marks=sc.nextInt();
 sc.close()
          if(marks<35)
	 {
		 System.out.println("Fail");
	 } 
	 
	 else if(marks==35)
	 {
		 System.out.println("just pass"); 
	 }
	 
	 else if((marks>35) && (marks<=50))
	 {
		 System.out.println("you get d grade");
	 }
	 
	 else if((marks>50) && (marks<=65))
	 {
		 System.out.println("you get c grade");
	 }
	 
		 else if((marks>65) && (marks<=75))
		 {
			 System.out.println("you get b grade");
		 }
	 
	 
			 else if((marks>75) && (marks<=85))
			 {
				 System.out.println("you get a grade");
			 }
	 
			 else
			 {
				 System.out.println("you get a+ grade");
			 }
	}}
 
 
	
	
		 
	 