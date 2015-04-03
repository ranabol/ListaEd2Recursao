package Ex6;

public class Mdc {
	//OBS: X deve ser maior do que Y
	int mdc;
	public int calculaMdc(int x, int y){
		/*6.	O máximo divisor comum dos inteiros x e y 
		é o maior inteiro que é divisível por 
		x e y. Escreva uma função recursiva mdc em Java, que 
		retorna o máximo divisor comum de x e y. O mdc de x e y é definido
		como segue: se y é igual a 0, então mdc(x,y) é x; caso contrário, mdc(x,y) é 
		mdc (y, x%y), onde % é o operador resto. */
		
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
