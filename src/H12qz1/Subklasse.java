package H12qz1;


public class Subklasse extends Superklasse
{
  private int y = 3;
  Subklasse()
  {
    x += 2; //Deze x verwijst naar de protected x = 5 aangemaakt in de superklasse. Dus x = 5 + 2 = 7.
    y++;
    System.out.print(x + ", " + y);
  }
  public static void main(String[] args)
  {
    Subklasse sk = new Subklasse(); //Roept de no-argument constructor SubKlasse aan
  }
}
