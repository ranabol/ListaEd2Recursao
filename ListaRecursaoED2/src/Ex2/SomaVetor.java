package Ex2;

public class SomaVetor {
	//Vetor
	int [] vetor = {1,9,3,7,6,4};
	int elemento,soma;
	public void somaElementos(){
		if (elemento<vetor.length){
			soma += vetor[elemento];
			elemento++;
			somaElementos();
		}
	}
	

}
