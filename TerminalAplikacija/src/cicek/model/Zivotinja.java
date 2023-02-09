package cicek.model;

import java.math.BigDecimal;
import java.util.Date;

public class Zivotinja extends Entitet{
	
	private BigDecimal minimalnaKvadratura;
	private BigDecimal minimalnaKubikaza;
	private String zivotinjskaVrsta;
	private String vrsta;
	private String ime;
	private Date datumRodenja;
	private Date datumDolaska;
	private Date datumSmrti;
	private Djelatnik djelatnik;
	private Prostorija prostorija;
	
	
	public Zivotinja() {
		super();
	}
	public Zivotinja(int sifra, BigDecimal minimalnaKvadratura, BigDecimal minimalnaKubikaza, String zivotinjskaVrsta,
			String vrsta, String ime, Date datumRodenja, Date datumDolaska, Date datumSmrti, Djelatnik djelatnik,
			Prostorija prostorija) {
		super(sifra);
		this.minimalnaKvadratura = minimalnaKvadratura;
		this.minimalnaKubikaza = minimalnaKubikaza;
		this.zivotinjskaVrsta = zivotinjskaVrsta;
		this.vrsta = vrsta;
		this.ime = ime;
		this.datumRodenja = datumRodenja;
		this.datumDolaska = datumDolaska;
		this.datumSmrti = datumSmrti;
		this.djelatnik = djelatnik;
		this.prostorija = prostorija;
	}
	public BigDecimal getMinimalnaKvadratura() {
		return minimalnaKvadratura;
	}
	public void setMinimalnaKvadratura(BigDecimal minimalnaKvadratura) {
		this.minimalnaKvadratura = minimalnaKvadratura;
	}
	public BigDecimal getMinimalnaKubikaza() {
		return minimalnaKubikaza;
	}
	public void setMinimalnaKubikaza(BigDecimal minimalnaKubikaza) {
		this.minimalnaKubikaza = minimalnaKubikaza;
	}
	public String getZivotinjskaVrsta() {
		return zivotinjskaVrsta;
	}
	public void setZivotinjskaVrsta(String zivotinjskaVrsta) {
		this.zivotinjskaVrsta = zivotinjskaVrsta;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public Date getDatumRodenja() {
		return datumRodenja;
	}
	public void setDatumRodenja(Date datumRodenja) {
		this.datumRodenja = datumRodenja;
	}
	public Date getDatumDolaska() {
		return datumDolaska;
	}
	public void setDatumDolaska(Date datumDolaska) {
		this.datumDolaska = datumDolaska;
	}
	public Date getDatumSmrti() {
		return datumSmrti;
	}
	public void setDatumSmrti(Date datumSmrti) {
		this.datumSmrti = datumSmrti;
	}
	public Djelatnik getDjelatnik() {
		return djelatnik;
	}
	public void setDjelatnik(Djelatnik djelatnik) {
		this.djelatnik = djelatnik;
	}
	public Prostorija getProstorija() {
		return prostorija;
	}
	public void setProstorija(Prostorija prostorija) {
		this.prostorija = prostorija;
	}
	
	
	@Override
	public String toString() {
		//što želimo vidjeti
		return ime;
	}
	

}
