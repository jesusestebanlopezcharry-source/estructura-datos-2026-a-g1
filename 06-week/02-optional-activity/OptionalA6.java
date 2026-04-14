import java.util.Scanner;

class Nodo {
    String dato;
    Nodo siguiente;

    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    public void agregar(String nombre) {
        Nodo nuevo = new Nodo(nombre);

        if (cabeza == null) {
            cabeza = nuevo; // Cabeza
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo; // Enlace
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;

        System.out.println("\n===== LISTA ENLAZADA =====");
        System.out.println("Cabeza → apunta al primer nodo\n");

        while (actual != null) {

            System.out.println("┌───────────────┐");
            System.out.println("│ Dato: " + actual.dato);
            System.out.print("│ Link: ");

            if (actual.siguiente != null) {
                System.out.println("apunta a → " + actual.siguiente.dato);
            } else {
                System.out.println("NULL (último nodo)");
            }

            System.out.println("└───────────────┘\n");

            actual = actual.siguiente;
        }
    }

    // 🔥 Método para imprimir el punto 4
    public void explicarDinamica() {
        System.out.println("===== EXPLICACIÓN (PUNTO 4) =====");
        System.out.println("1. La lista enlazada es dinámica porque los nodos se crean en tiempo de ejecución.");
        System.out.println("2. No tiene un tamaño fijo y puede crecer o disminuir según la necesidad.");
        System.out.println("3. Los nodos se enlazan mediante referencias en memoria.");
        System.out.println("4. Permite agregar o eliminar elementos sin reorganizar toda la estructura.");
        System.out.println("5. Es flexible y eficiente para manejar datos variables.");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese el nombre del estudiante " + i + ": ");
            lista.agregar(sc.nextLine());
        }

        lista.mostrar();

        // 🔥 Imprime el punto 4 al final
        lista.explicarDinamica();

        sc.close();
    }
}