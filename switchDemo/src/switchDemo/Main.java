package switchDemo;

public class Main {

	public static void main(String[] args) {
char grade = 'C';
		
		switch (grade) {
		case 'A' :
			System.out.println("Mükemmmel : Geçtiniz");
			break;
		case 'B' :	
		case 'C' :
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D' :
			System.out.println("Fena değil : Geçtiniz");
			break;
		case 'F' :
			System.out.println("Maalesef kaldınız");
			break;
	    default:
			System.out.println("Geçersiz not girdiniz"); 
			
				
		}

	}

}