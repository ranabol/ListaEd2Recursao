package Ex6;

public class Mdc {
	//OBS: X deve ser maior do que Y
	int mdc;
	public int calculaMdc(int x, int y){
				
		if (y==0){
			mdc = x;
			return mdc;
		}
		
		if(x%y!=0){
			mdc=calculaMdc(y,x%y);
			
		}else{
			mdc = y;
		}
		return mdc;
	}

}
