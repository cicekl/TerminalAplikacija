package cicek;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pomocno {
	
	public static Scanner ulaz;

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
		BigDecimal minimalnaKvadratura = ulaz.nextBigDecimal();
		
		return minimalnaKvadratura;
		
	}

	public static String unosStringa(String poruka) {
		String s;
		
		while(true) {
		
				System.out.println(poruka);
				s = ulaz.nextLine();
				if(s.trim().isEmpty()) {
					System.out.println("Obavezan unos!");
					continue;
				}
				return s;
		}	
		
	}
	
	
	
	
	

}
