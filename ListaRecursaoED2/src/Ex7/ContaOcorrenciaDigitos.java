package Ex7;

public class ContaOcorrenciaDigitos {
	int vezes,dig;
	public int contaOcorrenciaDigitos(int n,int k){
		
		dig = n%10;
		n/=10;
		if(dig==k)
			vezes++;
		if (n>=1){
			contaOcorrenciaDigitos(n, k);
		}
		return vezes;
	}
}
