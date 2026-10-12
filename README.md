# Práctica: Pilas Estáticas y Dinámicas en Java

**Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)  
**Materia:** Estructura de Datos  
**Docente:** Víctor Hugo Vásquez Herrera  
**Alumno:** Gerardo González Ramírez  

---

## 1. Diferencias Conceptuales

Ambas estructuras operan bajo el principio **LIFO** (*Last In, First Out*), donde el último elemento en entrar es el primero en salir.

* **Pila Estática (`pilaSimple.java`):**
  * Se almacena en un arreglo continuo de memoria fija.
  * Requiere definir un tamaño límite desde el inicio.
  * Implementa obligatoriamente `isFull()` para controlar el desbordamiento (*Overflow*).
  * Si no se llena por completo, deja memoria apartada sin usar.

* **Pila Dinámica (`pilaDinamica.java`):**
  * Se basa en nodos enlazados mediante referencias (`Nodo siguiente`).
  * Cada nodo se crea en el Heap conforme se necesita usando `new`.
  * No implementa `isFull()`, ya que su límite es la memoria RAM disponible.
  * Los nodos que se desapilan con `pop()` son liberados automáticamente por el *Garbage Collector*.

---

## 2. Compilación y Ejecución

### Desde Visual Studio Code
* Abrir el archivo `lanzador.java` y dar clic en el botón superior **Run Java** (o presionar `F5`).

### Desde Terminal
```bash
javac estructuras_lineales/*.java
java estructuras_lineales.lanzador
```

---

## 3. Salida de Consola (Pruebas de Ejecución)

```text
=== Pila Estática ===
Metiste: 10
Metiste: 20
Metiste: 30
¡Pila llena! No se pudo meter: 40
--- Pila Estática ---
[30]
[20]
[10]
Tope (peek): 30
Sacaste: 30
--- Pila Estática ---
[20]
[10]

=== Pila Dinámica ===
Metiste: 10
Metiste: 20
Metiste: 30
--- Pila Dinámica ---
[30]
[20]
[10]
Cima (peek): 30
Sacaste: 30
--- Pila Dinámica ---
[20]
[10]
```