import java.util.ArrayList;
public class Main {
   public static void main(String[] args) {
       ArrayList<doSomething> someStuff = new ArrayList<>();
       Rectangle r = new Rectangle(5,4);
       Student s = new Student("bob", 68);
       Vehicle v = new Vehicle("toyota", 4);
       someStuff.add(r);
       someStuff.add(s);
       someStuff.add(v);
       for(doSomething a : someStuff){
           a.saySomething();
           System.out.println("Weird number "+a.weirdNum());
       }
   }
}
