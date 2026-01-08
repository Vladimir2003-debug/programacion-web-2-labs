/*
 * Calculadora con metodos de clase
 */
public class Calculator {
    
    /**
     * Metodo que suma dos numeros enteros
     * @param a : primer sumando
     * @param b : segundo sumando
     * @return suma
     */
    public static int add(int a,int b) {
        return a + b; 
    }
    /**
     * Metodo que resta dos numeros
     * @param a : Minuendo
     * @param b : Sustraendo
     * @return Diferencia
     */
    public static int sub(int a ,int b) {
        return a-b;
    }

    /**
     * Metodo que multiplica dos numeros
     * @param a : factor
     * @param b : factor
     * @return El producto de los numeros
     */
    public static int mul(int a, int b) {
        return a * b;
    }
    
    /**
     * Metodo que divide un numero y retorna un entero
     * @param a : Dividendo
     * @param b : Divisor
     * @return : Cociente(entero)
     */
    public static int div(int a, int b) {
        return a/b;
    }
    
    /**
     * Metodo que saca el modulo de un numero
     * @param a : Dividendo
     * @param a : Divisor
     * @return Residuo
     */
    public static int mod(int a, int b) {
       return a % b; 
    }
}
