package Ex1;
import java.lang.Math;
public class InverteInt {
	//pega o menor n�mero da execu��o atual - usado para ver se haver� novos passos
	int digMenor,valor;
	//determina o peso que o d�gito atual ter�
	int numElevado;
	//numero de d�gitos do valor inicial
	int lenght;
	//Saber n�mero de d�gitos para inicializa��o 
	public void numeroDeDigitos(int n){

		this.lenght = (int)(Math.log10(n)+1); 
		//this.lenght = Integer.toString(n).length(); Equivalente a anterior
	}

	public void inverteUmNumero(int n){
		//Caso seja a primeira execu��o, retorna o numero de d�gitos e inicializa atributos
		if (lenght==0){
			numeroDeDigitos(n);
			numElevado = this.lenght-1;
		}
		//Pega o menor d�gito 
		digMenor = n%10;
		//Pega o n�mero sem o menor d�gito
		n=n/10;

		if (numElevado>=0){

			valor += digMenor*(Math.pow(10, numElevado));
			this.numElevado--;

			inverteUmNumero(n);

		}

	}


}


