package teamA.Quiz6;

public class Subklasse extends Superklasse
{
	char e = 'p';
  void mijnMethode()
  {
    x++; //x is 3 + 1 = 4
    System.out.print(e); //Print p uit, want de d van de superklasse wordt overschreden
    super.mijnMethode(); //Roept de methode mijnMethode() uit de superklasse aan
    x += 2; //x was 8, nu 10
    System.out.print(x); //Print 10 uit. Uiteindelijk dus pd810
  }
  public static void main(String[] args)
  {
    Subklasse sk = new Subklasse();
    sk.mijnMethode();
  }
}