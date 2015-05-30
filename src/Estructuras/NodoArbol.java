package Estructuras;

public class NodoArbol {
	int dato;
	NodoArbol nodoDer = null;
	NodoArbol nodoIzq = null;


	public NodoArbol (int dato){

		this.dato = dato;
		
	}
	
	public void setnodoIzq(NodoArbol nodo){
		nodoIzq = nodo;
		
	}
	public void setnodoDer(NodoArbol nodo){
		nodoDer = nodo;
		
	}
	public NodoArbol getnodoIzq(){
		return nodoIzq;
	}
	
	public NodoArbol getnodoDer(){
		return nodoDer;
	}
	public int getDato(){
		return dato;
	}
	
	public boolean isComplete(){
		if(nodoDer != null & nodoIzq != null)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	

}
