package Ex3;

public class SomatorioDeN {
	//fun��o recursiva
	int soma;
	
	public void somatorio(int n){
		soma += n;
		n--;
		//ponto de parada SE o numero � maior que N
		if(n>=1){
			somatorio(n);
		}
			
		
	}
	

}
