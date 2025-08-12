package main;

public class ArbolBinario {

    NodoArbol raiz; // Raíz del árbol binario, el nodo principal desde donde inicia el árbol

    public ArbolBinario() {
        raiz = null; // Inicialmente el árbol está vacío, sin ningún nodo
    }

    // Método para insertar un nuevo nodo con una llave (índice) y un contenido (fruta)
    public void insertar(int i, Object fruta) {
        NodoArbol n = new NodoArbol(i, fruta); // Crear un nuevo nodo con la llave y fruta indicadas

        if (raiz == null) {
            raiz = n; // Si el árbol está vacío, asignar el nuevo nodo como raíz
        } else {
            NodoArbol aux = raiz; // Auxiliar para recorrer el árbol, inicia desde la raíz
            NodoArbol padre = null; // Guarda el padre del nodo donde se insertará el nuevo nodo

            // Mientras el auxiliar no sea nulo, buscamos dónde insertar el nuevo nodo
            while (aux != null) {
                padre = aux; // Guardamos el nodo actual como padre antes de seguir bajando

                if (n.llave >= aux.llave) {
                    // Si la llave del nuevo nodo es mayor o igual que la del nodo actual,
                    // bajamos a la derecha para insertar
                    aux = aux.derecha;
                } else {
                    // Si la llave es menor, bajamos a la izquierda
                    aux = aux.izquierda;
                }
            }

            n.padre = padre; // Establecemos el padre del nuevo nodo (donde terminamos la búsqueda)

            // Insertamos el nuevo nodo como hijo izquierdo o derecho según su llave
            if (n.llave < padre.llave) {
                padre.izquierda = n; // Si la llave es menor que la del padre, va a la izquierda
            } else {
                padre.derecha = n; // Si es mayor o igual, va a la derecha
            }
        }
    }

    // Método para recorrer el árbol en orden (inorden): izquierda -> nodo -> derecha
    public void recorrer(NodoArbol n) {
        if (n != null) { // Si el nodo no es nulo, seguimos con el recorrido
            recorrer(n.izquierda); // Recorrer primero la rama izquierda
            System.out.println("Indice " + n.llave + " fruta " + n.contenido); // Imprimir el nodo actual
            recorrer(n.derecha); // Luego recorrer la rama derecha
        }
        // Si el nodo es nulo, simplemente no hacemos nada (fin de esa rama)
    }

    // Método para recorrer el árbol en orden, pero mostrando paso a paso la acción que se realiza
    public void recorridoInordenExplicado(NodoArbol n) {
        if (n != null) { // Si el nodo no es nulo:
            System.out.println("Bajando a la izquierda de nodo con índice " + n.llave);
            recorridoInordenExplicado(n.izquierda); // Bajamos recursivamente por la izquierda

            System.out.println("Visitando nodo con índice " + n.llave + " y fruta " + n.contenido);
            // Imprimimos que estamos visitando el nodo actual (procesando la fruta)

            System.out.println("Bajando a la derecha de nodo con índice " + n.llave);
            recorridoInordenExplicado(n.derecha); // Bajamos recursivamente por la derecha
        } else {
            // Si llegamos a un nodo nulo, indicamos que no hay más nodos y retrocedemos
            System.out.println("Nodo vacío, retrocediendo");
        }
    }
}