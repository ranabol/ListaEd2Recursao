package Ex8;

public class MultiplicaPorSoma {
	int cont;
	int result;
	public int multiplicaRec(int n1,int n2){
		if(cont==0)cont=n2;
		if(cont>0){
			result+=n1;
			cont--;
			multiplicaRec(n1, n2);
		}
		return result;
	}

}
