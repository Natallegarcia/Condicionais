package condicionais;

import java.util.Scanner;

public class Encadeados {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// se o cachorro tiver menos que seis meses,tem que vacinar as 4 doses contra Parvovirose 
		// se o cachorro tiver seis meses tem que castrar
		// se o cachorrro tem mais que seis meses tem que tomar vacina contra raiva 
		
		System.out.println ("Informe a idade em meses do seu  doguinho: ");
		int idade = scan.nextInt();
		
		if (idade < 6) {
			System.out.println ("Você precisa vacinar seu AUmiCão com as 4 doses da vacina contra a Parvovirose ");
		} else if (idade == 6) {
		System.out.println ("É recomendado castrar o doguinho caso não tenha objetivo de procriação  ");
		} else if (idade > 6) {
			System.out.println ("Você precisa vacinar seu AUmiCão contra a doença da Raiva");
		}

	}

}
