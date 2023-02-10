package cicek;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Pomocno {
	
	public static Scanner ulaz;
	public static boolean DEV;

	public static int unosRaspon(String poruka, int min, int max) {
		int broj;
		while(true) {
			try {
				System.out.println(poruka);
				broj = Integer.parseInt(ulaz.nextLine());
				if(broj<min || broj>max) {
					System.out.println("Broj mora biti između " + min + " i " + max);
					continue;
				}
				return broj;
				
			} catch(Exception e) {
				System.out.println("Niste unijeli broj! Pokušajte ponovno.");
			}
		}
	}

	public static BigDecimal unosDecimalni(String poruka) {
		System.out.println(poruka);
		String minimalnaKvadratura = ulaz.nextLine();
		return new BigDecimal(minimalnaKvadratura);
		
	}

	public static String unosStringa(String poruka) {
		String s;
		
		while(true) {
			System.out.println(poruka);
				s = ulaz.nextLine();
				if(provjeraStringa(s)) {
					return s;
				}else {
					System.out.println("Pogrešan unos imena!");
			}
		}	
		
	}
	
	public static boolean provjeraStringa(String ime) {
	    char[] chars = ime.toCharArray();
	    
	    if (ime == null || ime.isEmpty()) {
	        return false;
	    }
	    
	    for (char znak : chars) 
	    {
	         if(!Character.isLetter(znak)) 
	         {
	                return false;
	         }
	    }

	    return true;
	}

	public static Date unosDatuma(String poruka) {
		System.out.println(poruka);
		String date = ulaz.nextLine();
		Date dateFinal;
		while(true) {
		try {
		dateFinal = new SimpleDateFormat("dd.MM.yyyy.").parse(date);
		return dateFinal;
		}catch(Exception e) {
			System.out.println("Pogrešan unos datuma!");
		}
	} } 
	
	
	
	
	

}
