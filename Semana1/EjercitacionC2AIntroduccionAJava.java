/*Ejercitación Funciones

Ejercicio 1
Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
función debe comprobar si el primer número es divisible por el segundo.
boolean esDivisible(int n, int divisor)
NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
decimales.*/

public static void main(String[] args) {
        int numero = 10;
        int divisor = 2;
        boolean divisible = esDivisible(numero, divisor);

        System.out.println("Es " + numero + " divisible entre " + divisor + " ? " + " Respuesta: " + divisible);
    }

        public static boolean esDivisible(int numero, int divisor){
        if (numero % divisor == 0) {
            return true;
        }else{
            return false;
            }
        }
    }
