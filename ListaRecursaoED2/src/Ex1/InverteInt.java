package Ex1;
import java.lang.Math;
public class InverteInt {
	//pega o menor número da execução atual - usado para ver se haverá novos passos
	int digMenor,valor;
	//determina o peso que o dígito atual terá
	int numElevado;
	//numero de dígitos do valor inicial
	int lenght;
	//Saber número de dígitos para inicialização 
	public void numeroDeDigitos(int n){

		this.lenght = (int)(Math.log10(n)+1); 
		//this.lenght = Integer.toString(n).length(); Equivalente a anterior
	}

	public void inverteUmNumero(int n){
		//Caso seja a primeira execução, retorna o numero de dígitos e inicializa atributos
		if (lenght==0){
			numeroDeDigitos(n);
			numElevado = this.lenght-1;
		}
		//Pega o menor dígito 
		digMenor = n%10;
		//Pega o número sem o menor dígito
		n=n/10;

		if (numElevado>=0){

			valor += digMenor*(Math.pow(10, numElevado));
			this.numElevado--;

			inverteUmNumero(n);

		}

	}


}


