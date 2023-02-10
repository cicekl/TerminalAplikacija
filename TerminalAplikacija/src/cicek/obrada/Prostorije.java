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
			prostorije.add(new Prostorija(1, 35,35,70,null)); //dodavanje liste
			prostorije.add(new Prostorija(2, 150,170,5,null));
			prostorije.add(new Prostorija(3, 50,50,90,null));
		}
	}

	public List<Prostorija> getProstorije() {
		return prostorije;
	}

	public void setProstorije(List<Prostorija> prostorije) {
		this.prostorije = prostorije;
	} //za start ne treba
	
	
	
	}
	
	
	


