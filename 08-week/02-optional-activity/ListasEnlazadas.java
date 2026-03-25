import java.util.Scanner;

/*
 * Nombre: Jesus Lopez Charry
 * Usuario Git: jesusestebanlopezcharry-source
 */

public class ListasEnlazadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir los nombres de los 4 estudiantes
        System.out.print("Ingrese nombre del estudiante 1: ");
        String n1 = sc.nextLine();

        System.out.print("Ingrese nombre del estudiante 2: ");
        String n2 = sc.nextLine();

        System.out.print("Ingrese nombre del estudiante 3: ");
        String n3 = sc.nextLine();

        System.out.print("Ingrese nombre del estudiante 4: ");
        String n4 = sc.nextLine();

        // Dibujo de la lista enlazada con los datos ingresados
        System.out.println("\n                 Cabeza (Head)");
        System.out.println("                       ↓");
        System.out.println("        ┌───────────────┐      ┌───────────────┐      ┌───────────────┐      ┌───────────────┐");
        System.out.println("        │   " + n1 + "        │      │   " + n2 + "       │      │   " + n3 + "      │      │   " + n4 + "         │");
        System.out.println("        │   (dato)      │      │   (dato)      │      │   (dato)      │      │   (dato)      │");
        System.out.println("        │     • ────────┼─────▶│     • ────────┼─────▶│     • ────────┼─────▶│    null       │");
        System.out.println("        └───────────────┘      └───────────────┘      └───────────────┘      └───────────────┘");

        // Explicación (5 líneas)
        System.out.println("\nExplicación:");
        System.out.println("Esta estructura es dinámica porque puede crecer o disminuir sin un tamaño fijo.");
        System.out.println("Los nodos se crean en memoria cuando se necesitan.");
        System.out.println("No requiere posiciones contiguas como los arreglos.");
        System.out.println("Permite insertar y eliminar elementos fácilmente.");
        System.out.println("Es flexible para manejar datos que cambian constantemente.");

        sc.close();
    }
}