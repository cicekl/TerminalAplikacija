package cicek.obrada;

import java.util.ArrayList;
import java.util.List;

import cicek.Pomocno;
import cicek.Start;
import cicek.model.Zivotinja;

public class Zivotinje {
	
	private List<Zivotinja> zivotinje; //konstruirana
	private Start start;
	
	
	public Zivotinje(Start start, List<Zivotinja> zivotinje) { //radi samo sa start klasom
		super();
		this.start = start;
		this.zivotinje = zivotinje;
	}

	public Zivotinje(Start start) {
		super();
		this.start = start;
		zivotinje = new ArrayList<>();
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
				pregled();
				break;
			case 3:
				if(zivotinje.size()==0) {
					System.out.println("Nema životinja koje bi promijenili!");
				izbornik(); 
				}  else {
				//	promjena();
			}
				break;
			case 4: 
				if(zivotinje.size()==0) {
					System.out.println("Nema životinja koje bi obrisali!");
				izbornik(); 
				}  else {
			//		brisanje();
			}
				break;
			case 5: 
				start.glavniIzbornik();
				
		
	}

	
}

	private void pregled() {
		System.out.println("");
		System.out.println("Životinje u aplikaciji:");
		for(Zivotinja z: zivotinje) {
			System.out.println(z);
		}
		
		izbornik();
		
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
		z.setVrsta(Pomocno.unosStringa("Unesi vrstu životinje"));
		z.setIme(Pomocno.unosStringa("Unesi ime životinje"));
		//datumi
		//djelatnik i prostorija
		return z;
	} }
