import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program1 {

	/**
	 Program koji na osnovu unetih ocena izračunava uspeh učenika
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	prosek:	try {
			System.out.println("Unesite broj predmeta čije ocene ulaze u prosek: "); 	// Korisnik unosi broj predmeta koji ulaze u uspeh
			int n = Integer.parseInt(br.readLine());
			float s = 0;	//Zbir svih ocena će se čuvati u promenljivoj s 
			System.out.println("Unesite ocene: "); 		// Korisnik će unositi svaku ocenu pojedinačno
			int unos;
			for (int i=1 ; i<=n ; i++) {
				unos = Integer.parseInt(br.readLine());
				if (unos ==  1) {
					System.out.println("Uspeh je nedovoljan!"); // Ukoliko je ocena iz nekog predmeta 1, onda je uspeh nedovoljan
					break prosek; // U tom slučaju nema proseka
				}
				else if ((unos>5) || (unos<1)) {
					System.out.println("Ocenu ste uneli pogrešno! Vrednost ocene je iz skupa vrednosti {1, 2, 3, 4, 5}."); // Ukoliko je uneta ocena manja od 1 ili veća od 5, prekida se trenutna iteracija i vraća se na prethodnu
					i--;
					continue;
				}
				else {
				s += unos; 	//Sabiraju se sve ocene od prve do n-te i čuvaju u promenljivoj s
				}
			}
			s=s/n;	// Izračunava se prosek podelom zbira svih ocena sa njihovim brojem
			if ((s>=2.0) && (s<=5.0)) {
				System.out.println("Prosek je: " + (float)((int)(s*100.0f))/100.0f); // Ispisujemo prosek, prethodno zaokrugljen na dve decimale		
				if ((s>=4.5) & (s<=5.0)) {		//Ispisujemo ostvaren uspeh
					System.out.println("Uspeh je odličan!");
				}
				else if ((s>=3.5) & (s<4.5)) {
					System.out.println("Uspeh je vrlo dobar!");
				}
				else if ((s>=2.5) & (s<3.5)) {
					System.out.println("Uspeh je dobar!");
				}
				else {
					System.out.println("Uspeh je dovoljan!");
				}
			}
		}catch(Exception e){
			System.out.print("Greska: "+e.getMessage());
		}
	}
}
