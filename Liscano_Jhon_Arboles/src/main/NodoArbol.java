package main;

public class NodoArbol {  // Declaración de la clase NodoArbol, que representa un nodo en el árbol binario
	
	public NodoArbol padre;    // Referencia al nodo padre de este nodo
    public NodoArbol derecha;  // Referencia al nodo hijo derecho
    public NodoArbol izquierda; // Referencia al nodo hijo izquierdo
    public int llave;          // Valor numérico (índice) que identifica y ordena el nodo
    public Object contenido;   // Contenido o dato que almacena el nodo (en este caso, una fruta)

    // Constructor de la clase NodoArbol que recibe un índice y un objeto (fruta)
    public NodoArbol(int indice, Object fruta) {
        this.llave = indice;        // Inicializa la llave con el valor recibido
        this.contenido = fruta;     // Inicializa el contenido con el objeto recibido
        this.derecha = null;        // Inicializa la referencia derecha como nula (sin hijo)
        this.izquierda = null;      // Inicializa la referencia izquierda como nula (sin hijo)
        this.padre = null;          // Inicializa la referencia al padre como nula (sin padre)
    }
}
