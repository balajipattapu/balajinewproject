public class marks {

	public static void main(String[] args) {
		int marks=55;
		if(marks<35)
		 {
			 System.out.println("Fail");
		 } 
		 
		 else if(marks==35)
		 {
			 System.out.println("just pass"); 
		 }
		 
		 else if((marks>35) | (marks<=50))
		 {
			 System.out.println("you get d grade");
		 }
		 
		 else if((marks>50) | (marks<=65))
		 {
			 System.out.println("you get c grade");
		 }
		 else
		 {
			 System.out.println("default number");
		 }
		 
	}

}
