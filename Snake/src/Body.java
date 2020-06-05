
public class Body {
  
  private int snake_length;
  private int fruit;
  private int score;
  private int time;
  private static boolean crash;
  
  public Body(int snake_length, int fruit, int score, int time, boolean crash) {
    super();
    this.snake_length = snake_length;
    this.fruit = fruit;
    this.score = score;
    this.time = time;
    Body.crash = crash;
  }
  
  
  public static void game() {
  
  while(crash == false) {
    System.out.println("hey");
  }
  

  /*
  private int grow() {
    
    if(snake eats fruit) {
      snake_length +=1;
      return snake_length;
    }
    
  }*/
  }
  public static void main (String[]args) {
    Body snake1 = new Body(1, 1, 0, 0, false);
    game();
  }

}
