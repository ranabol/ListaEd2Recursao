package Ex1;
import java.lang.Math;
public class InverteInt {
	//pega o menor n�mero da execu��o atual - usado para ver se haver� novos passos
	int digMenor,valor;
	//determina o peso que o d�gito atual ter�
	int numElevado;
	int lenght;
	//Saber n�mero de d�gitos para inicializa��o
	public void numeroDeDigitos(int n){
		
		this.lenght = (int)(Math.log10(n)+1);
	}
	
	public void inverteUmNumero(int n){
		
			if (lenght ==0){
				numeroDeDigitos(n);
				numElevado = this.lenght;
			}
			
			digMenor = n%10;
			n=n/10;
						
			if (numElevado>=1){

				valor += digMenor*(Math.pow(10, numElevado-1));
				this.numElevado--;
				
				inverteUmNumero(n);
				
			}
				
		}
		
		
	}


