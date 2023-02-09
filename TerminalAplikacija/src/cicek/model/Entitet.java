package cicek.model;

abstract class Entitet {
	
	private int sifra;
	

	public Entitet(int sifra) {
		super();
		this.sifra = sifra;
	}

	public Entitet() {
		super();
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
	

}
