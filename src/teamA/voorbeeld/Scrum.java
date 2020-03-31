package src.teamA.voorbeeld;

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
