public class Calculadora {

    //metodos general para la +,-,*,/
    public double operacionesbasicas(double num1, double num2, char operador){
        //use el swith para evitar hacer muchos metodos de las operaciones y ayuda hacer metodo general para los operaciones basicos
        switch (operador){
            case '+' :
                return num1 + num2;
            case '-':
                return num1 - num2;
            case     '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {// Verifica que el segundo numero4 no sea cero
                    throw  new ArithmeticException("No se puede dividir entre cero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("\nOperador no válido. Use +, -, * O /.");
        }
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);// Math.pow es mejor para las potencia dentro de java
    }

    public double raizCuadrada(double numero){
        if (numero < 0){//verificando que el numero no sea negativo
            throw new ArithmeticException("no se puede calcular la raiz cuadrada de un numero negativo. ");
        }
        return Math.sqrt(numero);
    }


    }

