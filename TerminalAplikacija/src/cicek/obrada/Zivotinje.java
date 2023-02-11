package cicek.obrada;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import cicek.Pomocno;
import cicek.Start;
import cicek.model.Djelatnik;
import cicek.model.Zivotinja;

public class Zivotinje {
	
	private List<Zivotinja> zivotinje; //konstruirana
	private Start start;
	
	public Zivotinje(Start start) {
		super();
		this.start = start;
		zivotinje = new ArrayList<>();
		testPodaci(); //nakon konstrukcije
	}
	
	public Zivotinje(Start start, List<Zivotinja> zivotinje) { //radi samo sa start klasom
		super();
		this.start = start;
		this.zivotinje = zivotinje;
		testPodaci();
	}
	

	private void testPodaci() {
		if(Pomocno.DEV) {
			zivotinje.add(new Zivotinja(1, new BigDecimal(1200.00), new BigDecimal(42000.00), "Ptice","Kanarinac","Žutokljunac",null, null, null, null, null)); //dodavanje liste
			zivotinje.add(new Zivotinja(2, new BigDecimal(20000.00),new BigDecimal(4000000.00),"Sisavci" ,"Siva vjeverica","Sivka",null,null,null,null,null));
			zivotinje.add(new Zivotinja(3,new BigDecimal(2000.00),new BigDecimal(500.00),"Sisavci","Činčila","Frxy",null,null,null,null,null));
		}
		
	}
	
	public void izbornik() {
		System.out.println("");
		System.out.println("IZBORNIK ŽIVOTINJA");
		System.out.println("-----------------------");
		System.out.println("Mogućnosti:");
		System.out.println("");
		System.out.println("1. Unos nove životinje");
		System.out.println("2. Pregled svih životinja");
		System.out.println("3. Promjena postojeće životinje");
		System.out.println("4. Brisanje životinje");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
		
	}
	
	public List<Zivotinja> getZivotinje() {
		return zivotinje;
	}

	public void setZivotinje(List<Zivotinja> zivotinje) {
		this.zivotinje = zivotinje;
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
				if(zivotinje.size()==0) {
					System.out.println("Nema životinja koje bi promijenili!");
				izbornik(); 
				}  else { 
				promjena(); }
				break; 
			case 4: 
				if(zivotinje.size()==0) {
					System.out.println("Nema životinja koje bi obrisali!");
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
		int rb = Pomocno.unosRaspon("Odaberite djelatnika kojeg želite obrisati: ", 1, zivotinje.size());
		zivotinje.remove(rb-1);
		izbornik();
		
	}

	private void promjena() {
	pregled(false);
	int rb= Pomocno.unosRaspon("Odaberi životinju koju želiš promijeniti: ", 1, zivotinje.size());
	Zivotinja z = zivotinje.get(rb-1); 
	z.setMinimalnaKvadratura(Pomocno.unosDecimalni("Unesi minimalnu kvadraturu za željenu životinju: "));
	z.setMinimalnaKubikaza(Pomocno.unosDecimalni("Unesi minimalnu kubikazu za željenu životinju: "));
	z.setZivotinjskaVrsta(Pomocno.unosStringa("Unesi životinjsku vrstu životinje: "));
	z.setVrsta(Pomocno.unosStringa("Unesi vrstu životinje:"));
	z.setIme(Pomocno.unosStringa("Unesi ime životinje:"));
	z.setDatumRodenja(Pomocno.unosDatuma("Unesite datum rođenja životinje u formatu dd.mm.yyyy.:"));
	z.setDatumDolaska(Pomocno.unosDatuma("Unesite datum dolaska životinje u formatu dd.mm.yyyy.:")); 	
	//djelatnik pa prostorija
	
	izbornik();
	}

	private void pregled(boolean prikaziIzbornik) {
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("Životinje u aplikaciji:");
		System.out.println("");
		int rb=1;
		for(Zivotinja z: zivotinje) {
			System.out.println(rb++ + ". "+z);
		}
		System.out.println("-----------------------");
		if(prikaziIzbornik) {
		izbornik();
		}
		
	}

	private void unosNove() {
		zivotinje.add(unesiNovuŽivotinju());
		izbornik();
	}

	private Zivotinja unesiNovuŽivotinju() {
		Zivotinja z = new Zivotinja();
		z.setSifra(Pomocno.unosRaspon("Unesi šifru životinje: " ,1, Integer.MAX_VALUE));
		z.setMinimalnaKvadratura(Pomocno.unosDecimalni("Unesi minimalnu kvadraturu za željenu životinju: "));
		z.setMinimalnaKubikaza(Pomocno.unosDecimalni("Unesi minimalnu kubikazu za željenu životinju: "));
		z.setZivotinjskaVrsta(Pomocno.unosStringa("Unesi životinjsku vrstu životinje: "));
		z.setVrsta(Pomocno.unosStringa("Unesi vrstu životinje:"));
		z.setIme(Pomocno.unosStringa("Unesi ime životinje:"));
		z.setDatumRodenja(Pomocno.unosDatuma("Unesite datum rođenja životinje u formatu dd.mm.yyyy.:"));
		z.setDatumDolaska(Pomocno.unosDatuma("Unesite datum dolaska životinje u formatu dd.mm.yyyy.:")); 
		//djelatnik i prostorija
		start.getDjelatnici().pregled(false);
		int rbD = Pomocno.unosRaspon("Odaberite djelatnika koji radi s ovom životinjom: ", 1, start.getDjelatnici().getDjelatnici().size());
		z.setDjelatnik(start.getDjelatnici().getDjelatnici().get(rbD-1));
		start.getProstorije().pregled(false);
		int rbP = Pomocno.unosRaspon("Odaberite prostoriju u kojoj se nalazi ova životinja: ", 1, start.getProstorije().getProstorije().size());
		z.setProstorija(start.getProstorije().getProstorije().get(rbP-1));
		return z;
	} }
