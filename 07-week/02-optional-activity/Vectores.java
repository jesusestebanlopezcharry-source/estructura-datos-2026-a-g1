import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Vectores {

    public static void main(String[] args) {
        System.out.println("Hello and welcome to Java!");

        //Construir scanner
        Scanner scanner = new Scanner(System.in);

        //Definir el tamaño del vector. 
        int count = 0;
        if (count == 0) {
            System.out.print("Enter the size of the vector: ");
            count = scanner.nextInt();
        }

        //Vector A
        Double[] vectorA = new Double[count];
        Double[] vectorB = new Double[count]; 
        Double[] vectorC = new Double[count];

        //Vectores para operaciones
        Double[] suma = new Double[count];
        Double[] resta = new Double[count];
        Double[] multiplicacion = new Double[count];

        //definir i como incremento. 
        int i;

        //Llenar datos de Vector A
        for(i=0; i< vectorA.length; i++){
            vectorA[i] = (double) (i + 1);
        }

        //Llenar datos de Vector B
        for(i=0; i< vectorB.length; i++){
            vectorB[i] = vectorA[i] * 2;
        }

        //Vector C (como ya lo tenías)
        for(i=0; i< vectorC.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        //SUMA DE VECTORES
        for(i=0; i< vectorA.length; i++){
            suma[i] = vectorA[i] + vectorB[i];
        }

        //RESTA DE VECTORES
        for(i=0; i< vectorA.length; i++){
            resta[i] = vectorA[i] - vectorB[i];
        }

        //MULTIPLICACION DE VECTORES
        for(i=0; i< vectorA.length; i++){
            multiplicacion[i] = vectorA[i] * vectorB[i];
        }

        //Salida de los datos 
        System.out.println("\n\nVector A: ");
        for(i=0; i< vectorA.length; i++){
            System.out.print(vectorA[i].intValue() + " - ");
        }

        System.out.println("\n\nVector B: ");
        for(i=0; i< vectorB.length; i++){
            System.out.print(vectorB[i].intValue() + " * ");
        }

        System.out.println("\n\nVector C (A + B): ");
        for(i=0; i< vectorC.length; i++){
            System.out.print(vectorC[i].intValue() + " | ");
        }

        System.out.println("\n\nSuma de vectores: ");
        for(i=0; i< suma.length; i++){
            System.out.print(suma[i].intValue() + " ");
        }

        System.out.println("\n\nResta de vectores: ");
        for(i=0; i< resta.length; i++){
            System.out.print(resta[i].intValue() + " ");
        }

        System.out.println("\n\nMultiplicacion de vectores: ");
        for(i=0; i< multiplicacion.length; i++){
            System.out.print(multiplicacion[i].intValue() + " ");
        }
    }
}