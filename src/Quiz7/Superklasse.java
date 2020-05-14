package Quiz7;

public class Superklasse
{
  Superklasse(String naam) //wordt 's' vanwege de subklasse
  {
    this(naam, "d"); //Verwijst naar de 2 argumenten constructor
    System.out.print(naam); //naam is s, maar wordt pas uitgeprint nadat de 2 argumenten constructor wordt uitgeprint. Is nu sds
  }
  Superklasse(String naam, String naam2) //naam is 's', naam2 is 'd'. Dus wordt sd uitgeprint
  {
    System.out.print(naam);
    System.out.print(naam2);
  }
}
