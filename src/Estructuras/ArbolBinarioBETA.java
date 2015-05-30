package Estructuras;

public class ArbolBinarioBETA {
	
	public ArbolBinarioBETA(){
		
	}
	NodoArbol root = null;
	
	public boolean isEmpty(){
		if(root == null)
			return true;
		else
			return false;
	}
	
	public void insertar(int dato){
		if(isEmpty())

			root = new NodoArbol(dato);
		else{
			if(dato < root.getDato()){
				NodoArbol temp = new NodoArbol(dato);
				root.setnodoDer(temp);
			}
			else{
				NodoArbol temp = new NodoArbol(dato);
				root.setnodoIzq(temp);
			}
		}
			
			
			
		
	}
}
