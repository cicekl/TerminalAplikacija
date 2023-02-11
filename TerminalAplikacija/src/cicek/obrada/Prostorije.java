package cicek.obrada;

import java.util.ArrayList;
import java.util.List;

import cicek.Pomocno;
import cicek.Start;
import cicek.model.Djelatnik;
import cicek.model.Prostorija;

public class Prostorije {
	
	private List<Prostorija> prostorije;
	private Start start;
	
	public Prostorije(Start start) {
		super();
		this.start = start;
		prostorije = new ArrayList<>();
		testPodaci();
	}

	private void testPodaci() {
		
		if(Pomocno.DEV) {
			prostorije.add(new Prostorija(1, 35,35,70,"Male ptice")); //dodavanje liste
			prostorije.add(new Prostorija(2, 150,170,5,"Vjeverice"));
			prostorije.add(new Prostorija(3, 50,50,90,"Činčile"));
		}
	}
	
	
	public void izbornik() {
		System.out.println("");
		System.out.println("IZBORNIK PROSTORIJA");
		System.out.println("-----------------------");
		System.out.println("Mogućnosti:");
		System.out.println("");
		System.out.println("1. Unos nove prostorije");
		System.out.println("2. Pregled svih prostorija");
		System.out.println("3. Promjena postojećih prostorija");
		System.out.println("4. Brisanje prostorija");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
		
	}

	
	private void odabirIzbornika() {
		System.out.println("-----------------------");
		switch(Pomocno.unosRaspon("Odaberi opciju: ", 1, 5)) {
		case 1:
			unosNove();
			break;
		case 2:
			pregled(true);
			break;
		case 3:
			if(prostorije.size()==0) {
				System.out.println("Nema prostorija koje bi promijenili!");
			izbornik(); 
			}  else {
			promjena();
		}
			break;
		case 4: 
			if(prostorije.size()==0) {
				System.out.println("Nema prostorija koje bi obrisali!");
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
		int rb = Pomocno.unosRaspon("Odaberite djelatnika kojeg želite obrisati: ", 1, prostorije.size());
		prostorije.remove(rb-1);
		izbornik();
		
	}

	private void promjena() {
		pregled(false);
		int rb = Pomocno.unosRaspon("Odaberite djelatnika kojeg želite promijeniti: ", 1, prostorije.size());
		Prostorija p = prostorije.get(rb-1);
		p.setSifra(Pomocno.unosRaspon("Unesi šifru prostorije: ", 1, Integer.MAX_VALUE));
		p.setSirina(Pomocno.unosRaspon("Unesi širinu prostorije: ", 1, Integer.MAX_VALUE));
		p.setDuzina(Pomocno.unosRaspon("Unesi dužinu prostorije: ", 1, Integer.MAX_VALUE));
		p.setVisina(Pomocno.unosRaspon("Unesi visinu prostorije: ", 1, Integer.MAX_VALUE));
		izbornik();
		
	}

	public void pregled(boolean prikaziIzbornik) {
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("Prostorije u aplikaciji:");
		System.out.println("");
		int rb=1;
		for(Prostorija p: prostorije) {
			System.out.println(rb++ + ". "+p);
		}
		System.out.println("-----------------------");
		if(prikaziIzbornik) {
		izbornik();
		}
		
	}

	private void unosNove() {
		prostorije.add(unesiNovuProstoriju());
		izbornik();
		
	}

	private Prostorija unesiNovuProstoriju() {
		Prostorija p = new Prostorija();
		p.setSifra(Pomocno.unosRaspon("Unesi šifru prostorije: ", 1, Integer.MAX_VALUE));
		p.setSirina(Pomocno.unosRaspon("Unesi širinu prostorije: ", 1, Integer.MAX_VALUE));
		p.setDuzina(Pomocno.unosRaspon("Unesi dužinu prostorije: ", 1, Integer.MAX_VALUE));
		p.setVisina(Pomocno.unosRaspon("Unesi visinu prostorije: ", 1, Integer.MAX_VALUE));
		return p;
	}

	public List<Prostorija> getProstorije() {
		return prostorije;
	}

	public void setProstorije(List<Prostorija> prostorije) {
		this.prostorije = prostorije;
	} //za start ne treba
	
	
	
	
	
	}
	
	
	


