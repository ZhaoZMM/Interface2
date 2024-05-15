public class Student implements doSomething{
   private String name;
   private double gpa;


   public Student(String name, double gpa) {
       this.name = name;
       this.gpa = gpa;
   }


   @Override
   public String toString() {
       return name + " " + gpa;
   }


   public int weirdNum(){
       return (int)(gpa+gpa%gpa*gpa/gpa);
   }
   public void saySomething(){
       System.out.println("where am i again?");
   }
}
