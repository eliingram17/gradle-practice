package dice;

import java.util.Random;

public class Dice{
  public int roll(int sides) { 
    Random rn = new Random();
    int answer = rn.nextInt(sides) + 1;
    return answer;
  }
}