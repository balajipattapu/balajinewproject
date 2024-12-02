import java.io.*;
class Op{
public static void main(String ar[])throws Exception
{
//conneect keyword with inputstreamreader
InputStreamReader i=new InputStreamReader(system.in);
//connect bufferreader and inputstreamreader(i);
BufferReader b=new BufferReader 
//single character
char c=(char)b.read();
System.out.println("please enter a character");
System.out.println("you entered:"+b.read());
//read string
System.out.println("please enter name");
String name=b.readLine();
System.out.println("hello"+name+",wellcome to java");
System.out.println("please enter first number");
firstnum=Integer.parseInt(b.readline());
System.out.println("please enter second number");
secondnum=Interger.parseInt(b.readline());
int result=firstnum+secondnum;
System.out.println("result is :"+result)

}
}



