public class Game {

   public static void main(String[] args)
   {  
      Rabbit1 rabbit = new Rabbit1();
      Snake1 snake = new Snake1();
      
      for(int counter = 1; counter <= 4; counter++)
      {
         rabbit.move();
         snake.move();
      }
      
      rabbit.speak();
      rabbit.plead();
      snake.move();
      snake.eat();
   }
}