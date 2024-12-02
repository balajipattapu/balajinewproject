public class StudentInfo
{
    public void studentName()
    {
        System.out.println("Name:Vengat");
    }
    public void studentMark()
    {
        System.out.println("Mark:1005");
    }
    public void studentAddress()
    {
        System.out.println("Address:Chennai");
    }
   
    public static void main(String[] args)
    {
        StudentInfo info = new StudentInfo();
        info.studentName();
        info.studentMark();
        info.studentAddress();
    }
}



