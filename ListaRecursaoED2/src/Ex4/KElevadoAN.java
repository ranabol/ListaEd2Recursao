package Ex4;

public class KElevadoAN {
	int resultado=1;
	public void calculaElevado(int k,int n){
		if(n>0){
			resultado*=k;
			n--;
			calculaElevado(k, n);
		}
		
	}
	

}
