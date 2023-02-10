package cicek.model;

public class Djelatnik extends Entitet{ 
	
	private String ime;
	private String prezime;
	private String Iban;
	
	public Djelatnik(int sifra, String ime, String prezime, String iban) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		Iban = iban;
	}
	public Djelatnik() {
		super();
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getIban() {
		return Iban;
	}
	public void setIban(String iban) {
		Iban = iban;
	}
	
	@Override
	public String toString() {
		return ime + " " + prezime;
	}

}
