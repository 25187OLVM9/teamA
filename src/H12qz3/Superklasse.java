package H12qz3;

public class Superklasse
{
  protected char c = 'G';
  void mijnMethode() //Wordt pas gedaan wanneer deze wordt aangeroepen in de subklassen. Dus QNAG
  {
    System.out.print(c);
  }
  Superklasse() { //Wordt als eerst gedaan. Dus Q
	  System.out.print('Q'); 
  }
}