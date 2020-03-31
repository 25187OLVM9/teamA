package src.teamA.voorbeeld;
import java.util.ArrayList; //Importeert de arraylist commands


public class Scrum extends Voertuig{ 

	Scrum(String merk, String bouwjaar, String kleur) { // Verwijst naar de superklasse
		super(merk, bouwjaar, kleur);
	}

	private static ArrayList<Voertuig> voertuigen = new ArrayList<Voertuig>(); //maakt de arraylist 'voertuigen' aan

	public static void main(String[] args) {

		voegToe(voertuigen, new Voertuig(merk,bouwjaar,kleur)); //Roept de voegToe methode aan
		Print(voertuigen); //Roept de Print methode aan
	}

public static void voegToe(ArrayList<Voertuig> lijst, Voertuig eenVoertuig) { //Voegt een voertuig toe
    lijst.add(eenVoertuig);

}


static ArrayList<String> gegevens = new ArrayList<String>();
static int i = 1;
public static void Print(ArrayList<Voertuig> lijst) {

    for(Voertuig eenVoertuig: lijst) {            //Voert het uit voor hoeveel elementen er in de lijst staat

        String merk = eenVoertuig.getMerk(); //getMerk pakt het merk variabel uit de superklasse
        String bouw = eenVoertuig.getBouwjaar();
        String kleur = eenVoertuig.getKleur();
        gegevens.add("Voertuig " + i + ": "); //Doet "Voertuig + i" voor elk voertuig. Elke keer wordt i + 1 gedaan en dus wordt het steeds 1 meer.
		gegevens.add(merk);
		gegevens.add(bouw);
		gegevens.add(kleur);
		gegevens.add("\n");
		String keuze = eenVoertuig.getKeuze(); //Waar je kan invullen of je verder of niet verder wil
		if(keuze.contentEquals("Y")) { //Als Y wordt geantwoord dan wordt dit uitgevoerd
			i++; //Doet i + 1
			Print(lijst); //Voert de methode overnieuw uit
		}
		else //Wanneer iets anders dan 'Y' wordt geantwoord
		{	
			String formateerd = gegevens.toString() //Formateerd de arraylist om het er mooi uit te laten zien
				    .replace(",", "")  
				    .replace("[", "")  
				    .replace("]", "");  
				              
			System.out.print(" " + formateerd); //Print de arraylist uit
		}

	}
}


}
