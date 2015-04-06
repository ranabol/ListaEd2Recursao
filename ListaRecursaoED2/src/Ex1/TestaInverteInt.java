package Ex1;

import java.io.Console;
import java.util.Scanner;
import java.util.stream.Stream;



public class TestaInverteInt {

	public static void main(String[] args) {
		InverteInt invInt = new InverteInt();
		
		invInt.inverteUmNumero(123);
		
		System.out.println("Valor invertido: "+invInt.valor);
		
			
		
//		System.out.println(123%invInt.getValor());

	}

}
