package metodosString;
import java.util.Scanner;

public class Stringreverse {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String s;
		
		System.out.printf("Entrada:   ");
		s = ler.nextLine();
		
		System.out.println();
		
		System.out.printf("Entrada: %s\n", s);
		System.out.printf("saída: %s\n", inverterCaracteres(s));
		
		
	}
	
	public static String inverterCaracteres (String s) {
	int i, n;
	String sAux;
	
	sAux = "";
	n = s.length();
	
	 for(i = (n-1);  i>= 0; i--) {
		 sAux = sAux + s.charAt(i);
		
	}
	 
	 return(sAux);
	
			
		
	}

	
	

}
