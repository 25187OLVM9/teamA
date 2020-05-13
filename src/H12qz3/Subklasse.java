package H12qz3;

class Subklasse extends Superklasse
{
  char c2 = 'A';
  Subklasse() //Doe de N en de A, dus nu QNA
  {
    this('N');
    System.out.print(c2);
  }
  Subklasse(char b) //Wordt niet uitgevoerd.
  {
    System.out.print(b);
  }
  void mijnMethode()
  {
    super.mijnMethode();
    System.out.print(c2); //Nu QNAGA
  }
  public static void main(String[] args)
  {
    Subklasse subK = new Subklasse();
    subK.mijnMethode();
  }
	
}

