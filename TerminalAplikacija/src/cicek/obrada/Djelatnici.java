package cicek.obrada;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import cicek.Pomocno;
import cicek.Start;
import cicek.model.Djelatnik;
import cicek.model.Prostorija;
import cicek.model.Zivotinja;

public class Djelatnici {
	
	private List<Djelatnik> djelatnici;
	private Start start;
	
	
	public Djelatnici(Start start) {
		super();
		this.start = start;
		djelatnici = new ArrayList<>();
		testPodaci();
	}


	public Djelatnici(Start start, List<Djelatnik> djelatnici) {
		super();
		this.djelatnici = djelatnici;
		this.start = start;
		testPodaci();
		
		
	}
	
	private void testPodaci() {
		if(Pomocno.DEV) {
			djelatnici.add(new Djelatnik(1, "Tibor","Novak",null)); //dodavanje liste
			djelatnici.add(new Djelatnik(2, "Patricija", "Kovačić",null));
			djelatnici.add(new Djelatnik(3,"Patrik", "Ivanović",null));
		}
		
	}


	public void izbornik() {
		System.out.println("");
		System.out.println("IZBORNIK DJELATNIKA");
		System.out.println("-----------------------");
		System.out.println("Mogućnosti:");
		System.out.println("");
		System.out.println("1. Unos novog djelatnika");
		System.out.println("2. Pregled svih djelatnika");
		System.out.println("3. Promjena postojećeg djelatnika");
		System.out.println("4. Brisanje djelatnika");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
		
	}

	
	private void odabirIzbornika() {
		System.out.println("-----------------------");
		switch(Pomocno.unosRaspon("Odaberi opciju: ", 1, 5)) {
		case 1:
			unosNovog();
			break;
		case 2:
			pregled(true);
			break;
		case 3:
			if(djelatnici.size()==0) {
				System.out.println("Nema djelatnika koje bi promijenili!");
			izbornik(); 
			}  else {
			promjena();
		}
			break;
		case 4: 
			if(djelatnici.size()==0) {
				System.out.println("Nema djelatnika koje bi obrisali!");
			izbornik(); 
			}  else {
			brisanje();
		}
			break;
		case 5: 
			start.glavniIzbornik();
			
	
}


}


	private void brisanje() {
		pregled(false);
		int rb = Pomocno.unosRaspon("Odaberite djelatnika kojeg želite obrisati: ", 1, djelatnici.size());
		djelatnici.remove(rb-1);
		izbornik();
	}


	private void promjena() {
		pregled(false);
		int rb = Pomocno.unosRaspon("Odaberite djelatnika kojeg želite promijeniti: ", 1, djelatnici.size());
		Djelatnik d = djelatnici.get(rb-1);
		d.setSifra(Pomocno.unosRaspon("Unesi šifru djelatnika: ", 1, Integer.MAX_VALUE));
		d.setIme(Pomocno.unosStringa("Unesi ime djelatnika: "));
		d.setPrezime(Pomocno.unosStringa("Unesi prezime djelatnika: "));
		d.setIban("Unesi IBAN djelatnika: ");
		izbornik();
	}


	private void unosNovog() {
		djelatnici.add(unesiNovogDjelatnika());
		izbornik();
		
	}


	private Djelatnik unesiNovogDjelatnika() {
		Djelatnik d = new Djelatnik();
		d.setSifra(Pomocno.unosRaspon("Unesi šifru djelatnika: ", 1, Integer.MAX_VALUE));
		d.setIme(Pomocno.unosStringa("Unesi ime djelatnika: "));
		d.setPrezime(Pomocno.unosStringa("Unesi prezime djelatnika: "));
		d.setIban("Unesi IBAN djelatnika: ");
		return d;
	}


	public void pregled(boolean prikaziIzbornik) {
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("Djelatnici u aplikaciji:");
		System.out.println("");
		int rb=1;
		for(Djelatnik d: djelatnici) {
			System.out.println(rb++ + ". "+d);
		}
		System.out.println("-----------------------");
		if(prikaziIzbornik) {
		izbornik();
		}
	}

	public List<Djelatnik> getDjelatnici() {
		return djelatnici;
	}
	
}
