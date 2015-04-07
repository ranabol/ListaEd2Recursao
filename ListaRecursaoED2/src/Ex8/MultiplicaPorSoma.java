package Ex8;

public class MultiplicaPorSoma {
	int result;
	public int multiplicaRec(int n1,int n2){
		
		if(n2>0){
			result+=n1;
			n2--;
			multiplicaRec(n1, n2);
		}else{
			return 0;
		}
		return result;
	}

}
