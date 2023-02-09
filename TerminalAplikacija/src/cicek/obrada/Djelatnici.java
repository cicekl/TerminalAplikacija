package cicek.obrada;

import java.util.ArrayList;
import java.util.List;

import cicek.Pomocno;
import cicek.Start;
import cicek.model.Djelatnik;

public class Djelatnici {
	
	private List<Djelatnik> djelatnici;
	private Start start;
	
	
	public Djelatnici(Start start) {
		super();
		this.start = start;
		djelatnici = new ArrayList<>();
	}


	public Djelatnici(Start start, List<Djelatnik> djelatnici) {
		super();
		this.djelatnici = djelatnici;
		this.start = start;
		
		
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
		//	unosNove();
			break;
		case 2:
		//	pregled();
			break;
		case 3:
			if(djelatnici.size()==0) {
				System.out.println("Nema životinja koje bi promijenili!");
			izbornik(); 
			}  else {
			//	promjena();
		}
			break;
		case 4: 
			if(djelatnici.size()==0) {
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
	
	
}
