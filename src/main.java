
public class main {

	public static void main(String[] args) {
		
		int ika = 40;

		// Tulostusehdot
		
		
		if (ika > 0 && ika < 18) 
			{
			System.out.println("Olet alaikäinen");

			if (ika >= 16)
			{
				System.out.println("Saat ajaa kevaria"); 
			}
			else if (ika >= 15)
			{
			System.out.println("Saat ajaa mopoa"); 
			}
			
			}
			
			else if (ika >= 18 && ika < 65)
			{
				System.out.println("Olet aikuinen");
			}
			else if (ika >= 65) 
			{
			System.out.println("Olet eläkeläinen");
			} 
			if (ika >= 40 && ika <= 50)
			{
				System.out.println("Parasta keski-ikää");
			}
		
			if (ika >= 58 && ika < 65)
			{
				System.out.println("Voit mennä varhaiseläkkeelle");
			}
			if (ika == 65)
			{
				System.out.println("Hyviä eläkeäpäiviä");
			}
			
			if (ika == 18)
			{
				System.out.println("Saat ajaa autoa!");
			}
			if (ika <= 65 && ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60)
			{
				System.out.println("Onnittelut tasavuodesta");
			}
			if (ika == 100)
			{
				System.out.println
				("Hei,"
						+"\nsuuret onnittelut"
						+ "\nja hyvää jatkoa"		);
				
			}
			
			
			
			
		
		}
}


