package cicek.model;

public class Prostorija extends Entitet{

	private int sirina;
	private int duzina;
	private int visina;
	private String naziv;
	
	public Prostorija() {
		super();
	}
	public Prostorija(int sifra, int sirina, int duzina, int visina, String naziv) {
		super(sifra);
		this.sirina = sirina;
		this.duzina = duzina;
		this.visina = visina;
		this.naziv = naziv;
	}
	public int getSirina() {
		return sirina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	public int getDuzina() {
		return duzina;
	}
	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	@Override
	public String toString() {
		
		return naziv;
	}
	
}
