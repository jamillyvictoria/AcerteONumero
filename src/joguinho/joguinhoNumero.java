package joguinho;

import java.util.Scanner;
import java.util.Random;

public class joguinhoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		boolean acertou = false;
		int tentativas =3;
		int secreto = random.nextInt(20);
		int chute = 0;
		
		while( tentativas > 0 && acertou == false) {
			
			System.out.println ("Chute o número: ");
			chute = input.nextInt();
			
			if(secreto == chute){
				
				System.out.println ("PARABENSS, acertou !! ");
				acertou = true;	
				
			}	else if(chute < secreto){
				--tentativas;			
				System.out.println ("Numero muito pequeno, voce tem " + tentativas + " Tentativas restantes");
			}	else {
				--tentativas;
				System.out.println ("Numero muito grande, voce tem " + tentativas + " Tentativas restantes");
			}
		}
	}
	
}  
		