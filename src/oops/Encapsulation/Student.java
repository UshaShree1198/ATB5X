package src.oops.Encapsulation;

public class Student {


    private String name;
    private int Rollno;
  private   boolean isAttended;

    public Student(int Rollno) {
        this.Rollno = Rollno;
    }

   public void setStudentAttended(boolean flag)
   {
   isAttended = flag;
       System.out.println("started");
   }

   public boolean getStudentAttended()
   {
       System.out.println("end");
       return isAttended;
   }





}
