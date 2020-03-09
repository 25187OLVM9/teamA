package teamA.voorbeeld;

import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;
import java.util.Random;



public class TableTest extends JFrame {

	String[][] nummers; //Maakt een array aan met 2 parameters

	String[] kolom = {"Column 1", "Column 2", "Column 3", "Column 4", "Column 5", "Column 6", "Column 7", "Column 8", "Column 9", "Column 10"}; //Maakt een array aan met columns


	TableTest() { //Deze methode maakt een Jtable aan
		Random rand = new Random(); //Maakt de variabel 'rand' een willekeurig nummer

		nummers = new String[10000][10];  //Zorgt dat er 10000 nummers komen in kolommen van 10

		for(int i = 0; i < 10000; ++i) {

			nummers[i][0] = "" + rand.nextInt(10000); //Voert een willekeurig nummer in met maximum 10000
			nummers[i][1] = "" + rand.nextInt(10000);		
			nummers[i][2] = "" + rand.nextInt(10000);		
			nummers[i][3] = "" + rand.nextInt(10000);		
			nummers[i][4] = "" + rand.nextInt(10000);
			nummers[i][5] = "" + rand.nextInt(10000);		
			nummers[i][6] = "" + rand.nextInt(10000);			
			nummers[i][7] = "" + rand.nextInt(10000);			
			nummers[i][8] = "" + rand.nextInt(10000);			
			nummers[i][9] = "" + rand.nextInt(10000);				

		}
		JTable t = new JTable(nummers, kolom); //Maakt de Jtable aan
		t.setAutoCreateRowSorter(true);	//Laat je de kolommen sorteren
		
		add(new JScrollPane(t)); //Zorgt dat je kan scrollen
	}



	public static void main(String[] args) {

		JFrame f = new TableTest();	

		f.setSize(1000,600); //Zet de grootte in van de Jframe
		f.setVisible(true);
	}



}
