package Ex6;

public class Mdc {
	//OBS: X deve ser maior do que Y
	int mdc;
	public int calculaMdc(int x, int y){
		/*6.	O m�ximo divisor comum dos inteiros x e y 
		� o maior inteiro que � divis�vel por 
		x e y. Escreva uma fun��o recursiva mdc em Java, que 
		retorna o m�ximo divisor comum de x e y. O mdc de x e y � definido
		como segue: se y � igual a 0, ent�o mdc(x,y) � x; caso contr�rio, mdc(x,y) � 
		mdc (y, x%y), onde % � o operador resto. */
		
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
