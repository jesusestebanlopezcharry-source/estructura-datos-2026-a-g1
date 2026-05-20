import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // =====================================
        // LISTA ENLAZADA DE LIBROS
        // =====================================

        LinkedList<String> libros = new LinkedList<>();

        System.out.println("===== BIBLIOTECA CORHUILA =====");

        System.out.print("\n¿Cuántos libros desea registrar?: ");
        int cantidadLibros = entrada.nextInt();
        entrada.nextLine();

        // Agregar libros dinámicamente
        for (int i = 0; i < cantidadLibros; i++) {

            System.out.print("Ingrese el nombre del libro "
                    + (i + 1) + ": ");

            String libro = entrada.nextLine();

            libros.add(libro);

        }

        // Mostrar libros
        System.out.println("\n===== LIBROS DISPONIBLES =====");

        for (String libro : libros) {

            System.out.println("- " + libro);

        }

        // =====================================
        // COLA DE TURNOS
        // =====================================

        Queue<String> turnos = new LinkedList<>();

        System.out.print("\n¿Cuántos estudiantes hay en turno?: ");
        int cantidadTurnos = entrada.nextInt();
        entrada.nextLine();

        // Agregar estudiantes a la cola
        for (int i = 0; i < cantidadTurnos; i++) {

            System.out.print("Ingrese el nombre del estudiante "
                    + (i + 1) + ": ");

            String estudiante = entrada.nextLine();

            turnos.add(estudiante);

        }

        System.out.println("\n===== TURNOS DE ATENCIÓN =====");

        System.out.println("Primer estudiante en turno: "
                + turnos.peek());

        // Atender estudiante
        String atendido = turnos.poll();

        System.out.println("Estudiante atendido: "
                + atendido);

        System.out.println("Siguiente estudiante: "
                + turnos.peek());

        // =====================================
        // PILA DE HISTORIAL
        // =====================================

        Stack<String> historial = new Stack<>();

        System.out.print("\n¿Cuántos préstamos desea registrar?: ");
        int cantidadPrestamos = entrada.nextInt();
        entrada.nextLine();

        // Agregar historial dinámicamente
        for (int i = 0; i < cantidadPrestamos; i++) {

            System.out.print("Ingrese el préstamo "
                    + (i + 1) + ": ");

            String prestamo = entrada.nextLine();

            historial.push(prestamo);

        }

        System.out.println("\n===== HISTORIAL DE PRÉSTAMOS =====");

        System.out.println("Último préstamo realizado: "
                + historial.peek());

        entrada.close();

    }

}