package estructuras_lineales;

public class lanzador {
    public static void main(String[] args) {
        // Prueba de Pila Estática
        System.out.println("=== Pila Estática ===");
        pilaSimples pe = new pilaSimples(3);
        pe.push(10);
        pe.push(20);
        pe.push(30);
        pe.push(40); // Prueba de desbordamiento (isFull)
        pe.mostrar();
        System.out.println("Tope (peek): " + pe.peek());
        pe.pop();
        pe.mostrar();

        // Prueba de Pila Dinámica
        System.out.println("\n=== Pila Dinámica ===");
        pilaDinamica pd = new pilaDinamica();
        pd.push(10);
        pd.push(20);
        pd.push(30);
        pd.mostrar();
        System.out.println("Cima (peek): " + pd.peek());
        pd.pop();
        pd.mostrar();
    }
}