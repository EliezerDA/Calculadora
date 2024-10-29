import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while(continuar){
            System.out.println("""
                    \nSeleccione una operación:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Potencia
                    6. Raiz Cuadrada
                    7. salir
                    """);
            int opcion = scanner.nextInt();

            try {
                double resultado = 0;

                switch (opcion){
                    //mi explicacion del blque switch primero evaluo los operador de tipo char que son las +,-,*,/ y segun el operador se ejecuta ese codigo
                    case 1:
                    System.out.println("Ingrese el primer numero");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    double num2 = scanner.nextDouble();
                    resultado = calculadora.operacionesbasicas(num1,num2,'+');
                break;
                    case 2:
                        System.out.println("Ingrese el primer numero");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo número: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.operacionesbasicas(num1, num2, '-');
                        break;
                    case 3:
                        System.out.print("Ingrese el primer número: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo número: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.operacionesbasicas(num1, num2, '*');
                        break;
                    case 4:
                        System.out.print("Ingrese el primer número: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo número: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.operacionesbasicas(num1, num2, '/');
                        break;
                        //case 1 al 4 cada case pide dos numeros num1 y num2 despues se llama a la clase caluladora
                        // yoperacionesBasicas hace la operacion y con return devueleve el resultado

                    case 5:
                        System.out.print("Ingrese la base: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingrese el exponente: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.potencia(num1, num2);
                        break;
                    //solo pedimos una base y exponente y luego se llama calculadora.potencia num1, num2 y devuleve el resultado
                    case 6:
                        System.out.print("Ingrese el número: ");
                        num1 = scanner.nextDouble();
                        resultado = calculadora.raizCuadrada(num1);
                        break;
                    case 7:
                        continuar = false;
                        System.out.println("Saliendo...");
                        continue;
                    default:
                        System.out.println("Opción no válida.");
                        continue;
                }System.out.println("Resultado: " + resultado);
//bloque de manejo de excepciones
            } catch (ArithmeticException e) {//ArithmeticException este expecion capta el error comun de dividir entre 0
                System.out.println("Error: " + e.getMessage());// e.getMessage este mensage lo muestra la consola con sout
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado.");
            }
            }
        }


    }
