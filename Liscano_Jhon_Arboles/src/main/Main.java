package main;

public class Main {
	
	public static void main(String[] args) {
		
        ArbolBinario arbol = new ArbolBinario();

        // Insertamos las frutas con su índice de forma estática
        arbol.insertar(4, "Naranja");
        arbol.insertar(8, "Manzana");
        arbol.insertar(1, "Uva");
        arbol.insertar(9, "Sandia");
        arbol.insertar(7, "Pera");

        System.out.println("=== Recorrido INORDEN del arbol binario ===");
        arbol.recorrer(arbol.raiz);
        
        System.out.println("\n=== Recorrido explicado paso a paso ===");
        arbol.recorridoInordenExplicado(arbol.raiz);
    }
}
