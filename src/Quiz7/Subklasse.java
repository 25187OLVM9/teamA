package Quiz7;

public class Subklasse extends Superklasse
{
  Subklasse(String naam)
  {
    super("s"); //Geeft 's' door naar de superklasse.
    System.out.print(naam); //Wordt uitgeprint nadat de superklasse klaar is. Is x vanwege "new Subklasse("x")". Is nu dus sdsx
  }
  public static void main(String[] args)
  {
    Subklasse sk = new Subklasse("x");
  }
}
