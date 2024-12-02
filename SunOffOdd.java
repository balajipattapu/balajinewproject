import java.util.*;

public class C {

	public static void main(String[] args) 
	{
         int count=0;

	for(int i=200;i<=600;i++)
	{
		if(i%2==1)
         {
            count=count+i;
	}
	}
          System.out.println(count);
	}

}