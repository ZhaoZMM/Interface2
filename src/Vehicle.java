  private String name;
   private int wheels;


   public Vehicle(String name, int wheels) {
       this.name = name;
       this.wheels = wheels;
   }


   public String getName() {
       return name;
   }


   public int getWheels() {
       return wheels;
   }


   public void turn() {
       System.out.println("I just turned");
   }


   public void brake() {
       System.out.println("I just braked");
   }


   public int weirdNum(){
       return wheels*wheels-wheels%wheels*wheels;
   }
   public void saySomething(){
       System.out.println("oops, almost crashed...");
   }
}
