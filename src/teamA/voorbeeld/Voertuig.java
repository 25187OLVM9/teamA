package teamA.voorbeeld;

import java.util.Scanner; //Importeert de scanner

public class Voertuig{

    static String merk;
    static String bouwjaar;
    static String kleur;
    static Scanner s = new Scanner(System.in);


    public Voertuig(String merk2, String bouwjaar2, String kleur2) { } //Waar de super naar verwijst

    public String getMerk() { //Waar je het merk invult
        System.out.println("Voer het merk in: ");
        String merk = s.nextLine();
        return merk;
    }
    public String getBouwjaar() { //Waar je het Bouwjaar invult
        System.out.println("Voer het bouwjaar in: ");
        String bouwjaar = s.nextLine();
        return bouwjaar;
    } 
    public String getKleur() { //Waar je de kleur invult
        System.out.println("Voer de kleur in: ");
        String kleur = s.nextLine();
        return kleur;
    }
    public String getKeuze() { //Waar je de keuze invult
        System.out.println("Wilt u doorgaan? (Y/N)");
        String keuze = s.nextLine();
        return keuze;
    }

}
