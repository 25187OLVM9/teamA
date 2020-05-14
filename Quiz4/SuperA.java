package Quiz4;

public class SuperA extends SuperB //roept SuperB aan
{
  int y = 7;
  public SuperA()
  {
    y++;
    System.out.print(" y" + y); //Gebeurd na SuperB. Doet y + 1, dus y8
  }
}