package estructuras_lineales;

public class pilaDinamica {
    private Nodo cima; // Apunta al elemento superior

    public pilaDinamica() {
        this.cima = null;
    }

    // Verifica si la pila no tiene nodos
    public boolean isEmpty() {
        return cima == null;
    }

    // Inserta un nuevo nodo en la cima
    public void push(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.siguiente = cima; // Apunta a la cima anterior
        cima = nuevo;           // El nuevo pasa a ser la cima
        System.out.println("Metiste: " + x);
    }

    // Extrae el nodo de la cima
    public int pop() {
        if (!isEmpty()) {
            int valor = cima.dato;
            cima = cima.siguiente; // Mueve la cima al nodo de abajo
            System.out.println("Sacaste: " + valor);
            return valor;
        } else {
            System.out.println("¡Pila vacía!");
            return -1;
        }
    }

    // Consulta el valor de la cima sin sacarlo
    public int peek() {
        if (!isEmpty()) {
            return cima.dato;
        } else {
            System.out.println("¡Pila vacía!");
            return -1;
        }
    }

    // Recorre y muestra los nodos de la cima al final
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Pila vacía.");
            return;
        }

        System.out.println("--- Pila Dinámica ---");
        Nodo actual = cima;
        while (actual != null) {
            System.out.println("[" + actual.dato + "]");
            actual = actual.siguiente;
        }
    }
}