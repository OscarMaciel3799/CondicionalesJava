public class Main {
    public static void main(String[] args) {
        //La sentencia if evalúa una condición y ejecuta un bloque de código si la condición es verdadera.
        int numero = 10;
        int numero2 = -3;
        int numero3=0;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        }

        //La sentencia if-else permite ejecutar un bloque de código si la condición es verdadera
        // y otro bloque si es falsa.
        if (numero2 >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número no es positivo.");
        }

        //La sentencia if-else if-else, permite evaluar múltiples condiciones.
        // Si la primera condición es falsa, se evalúa la siguiente, y así sucesivamente.
        if (numero3 > 0) {
            System.out.println("El número es positivo.");
        } else if (numero3 < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        //La sentencia switch permite seleccionar uno de varios bloques de código para ejecutar,
        // basado en el valor de una expresión.
        // Es útil cuando se tienen múltiples condiciones que dependen del mismo valor.
        int día = 3;
        switch (día) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Miércoles");
                break;
            case 6:
                System.out.println("Miércoles");
                break;
            case 7:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día no válido");
        }

        //El operador ternario es una forma compacta de escribir una sentencia if-else.
        // Se utiliza para asignar un valor basado en una condición.
        String resultado = (numero > 0) ? "Positivo" : "No positivo";
        System.out.println(resultado);
    }
}