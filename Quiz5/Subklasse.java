package Quiz5;

public class Subklasse extends Superklasse
{
  int mijnMethode(int i, int i2)
  {
    return mijnMethode(i) + x + i2; //mijnMethode(i) is 5, x = 2 dus 7, i2 = 6 dus 7 + 6 = 13.
  }
  public static void main(String[] args)
  {
    Subklasse subK = new Subklasse();
    System.out.print(subK.mijnMethode(3, 6));
  }
}
