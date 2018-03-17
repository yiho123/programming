public class RandomWalkDie { 

  private int max;
  private int faceValue;
  private MyRandom rnd;

  // initialize instance variables max and faceValue
  // faceValue should be a random number generated by rnd
  public RandomWalkDie(int max1) {
    rnd = new MyRandom();
    max = max1;
    faceValue = rnd.nextInt(max);

  }

  // generate a new faceValue using rnd and return this new value
  public int roll() {
     faceValue = rnd.nextInt(max);
      return faceValue;

  }
}
