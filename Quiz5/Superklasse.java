package Quiz5;

public class Superklasse
{
  protected int x = 2;
  int mijnMethode(int i)
  {
    return x + i; //x = 2, int i = 3. Dus 5. Wordt aangeroepen vanaf de subklasse.
  }
}
