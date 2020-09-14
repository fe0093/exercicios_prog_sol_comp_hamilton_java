package Primeira_lista_de_exercicios;

public class Triangle {

	public class Triangles {
	    
	    int a;
	    int b;
	    int c;
	    
	    public Triangles(){
	        
	    }
	    
	    public Triangles(int a, int b, int c){
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }   
	    
	    public boolean isTriangle(){
	        if(this.a < (this.b+this.c) || this.b < (this.a+this.c) || this.c < (this.a+this.b)){
	            return true;
	        }else{
	           return false;
	        }
	    }
	    
	    public String typeTriangle(){
	        
	        if(this.a == this.b && this.b == this.c && this.a == this.c){
	            return "Triangulo Equil�tero";
	        }else if(this.a != b && this.b != c && this.a != this.c) {
	            return "Triangulo Escaleno";
	        }else if((a == b && a != c) || (b == c && b != a) || (c == a && c != b)){
	            return "Tri�ngulo Is�sceles";
	        }else{
	            return "Tri�ngulo n�o identificado";
	        }
	    }
}
}
