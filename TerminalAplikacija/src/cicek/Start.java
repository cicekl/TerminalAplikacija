package cicek;

import java.util.Scanner;


import cicek.obrada.Djelatnici;
import cicek.obrada.Prostorije;
import cicek.obrada.Zivotinje;

public class Start {
	
	private Zivotinje zivotinje; //moraju biti povezani
	private Djelatnici djelatnici;
	private Prostorije prostorije;
	
	public Start() {
		
		Pomocno.ulaz = new Scanner(System.in);
		zivotinje = new Zivotinje(this);
		djelatnici = new Djelatnici(this);
		prostorije = new Prostorije(this);
		prvaPoruka();
		glavniIzbornik();
		
	}
	
	private void prvaPoruka() {
		System.out.println("Dobrodošli u ZOO terminal aplikaciju!");
	
		
	}

	public void glavniIzbornik() {
		System.out.println("");
		System.out.println("GLAVNI IZBORNIK");
		System.out.println("-----------------------");
		System.out.println("Mogućnosti:");
		System.out.println("");
		System.out.println("1. Životinje");
		System.out.println("2. Djelatnici");
		System.out.println("3. Prostorije");
		System.out.println("4. Izlaz iz programa");
		odabirGlavnogIzbornika();
	}

	private void odabirGlavnogIzbornika() { //puno malih metoda
		System.out.println("-----------------------");
		switch(Pomocno.unosRaspon("Odaberi opciju: ",1,4)) {
		
		case 1: 
			zivotinje.izbornik(); 
			break;
		case 2:
			djelatnici.izbornik();
			break;
		case 3:
			prostorije.izbornik();
			break;
		case 4:
			System.out.println("Doviđenja!");
		
		}
		
	}
	

	public Djelatnici getDjelatnici() {
		return djelatnici;
	}
	

	public Prostorije getProstorije() {
		return prostorije;
	}

	public static void main(String[] args) {
		if(args.length==1) {
			Pomocno.DEV=true;
		}else {
			Pomocno.DEV=false;
		}
		
		
		new Start();
		
	}
}
