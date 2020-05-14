package Quiz4;

public class Subklasse extends SuperA //roept SuperA aan
{
	int x;//Zelf toegevoegd. Hier 'reset' de waarde van x zodra hij wordt uitgevoerd in deze subklasse
  public Subklasse()
  {
    x += 2;
    y += 3;
    System.out.print(" x" + x); //Omdat int x niet geinitialiseerd is in dit bestand, begint x vanaf 0. dus x2
    System.out.print(" y" + y); //Deze gaat begin vanaf de vorige y waarde. Dus y11.
  }
  public static void main(String[] args)
  {
    Subklasse subK = new Subklasse();
  }
}
