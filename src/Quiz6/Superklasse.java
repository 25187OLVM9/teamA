package Quiz6;

public class Superklasse
{
  protected int x = 3;
  protected char e = 'd';
  void mijnMethode()
  {
    x += 4; //Doet x + 4, dus 8 nu
    System.out.print(e); //e is in de superklasse d
    System.out.print(x); //print 8 uit
  }
}
