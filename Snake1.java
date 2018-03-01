public class Snake1{

   String animal = "Snake";
   int y = 10;
   int x = 10;
   
   public void move()
   {
      y = y-1;
      x = x-1; 
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
   
   public void eat()
   {
      System.out.println("skrrr baa baa im eating you!");
   }

}