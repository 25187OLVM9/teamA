package H12qz2;

public class Subklasse extends Superklasse
{
  Subklasse(int y) //y = 4
  {
    x += y; //x was 3, nu 7
  }
  public static void main(String[] args)
  {
    Subklasse sk = new Subklasse(4);
    Subklasse sk2 = new Subklasse(6);
    System.out.println(sk.x); //roept de superklasse aan, waardoor x + 2 wordt gedaan en daarna + 4. x wordt 7
    System.out.print(sk2.x); //Hetzelfde als de vorige statement, alleen ipv x + 4 wordt het x + 6 vanwege de constructor. x wordt 9
  }
}
