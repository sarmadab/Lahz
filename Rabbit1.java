public class Rabbit1{

   String animal = "Rabbit";
   int y = 1;
   int x = 1;
   
   public void move()
   {
      y = y+1;
      x = x+1; 
      speak();
   }
   
   public void speak()
   {
      System.out.println("I am the " + animal + ", I am now standing on square " + tellPosition());
   }
   
   public String tellPosition()
   {
   // System.out.println (x + "," + y);
      return x + "," + y;
   }

   public void plead()
   {
      System.out.println("Nooo Please dont!!");
   }
}