package Quiz4;

public class SuperB
{
  protected int x = 3;
  public SuperB()
  {
    x += 2;
    System.out.print(" x" + x); //Doet 3 + 2, dus eerst wordt x5 uitgeprint.
  }
}