
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{


    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {

    }

    /**
     * Imprime por pantalla todos los múltiplos de 5 entre 10 y 95 (ambos extremos no incluidos)
     */
    public void multiplesOfFive()
    {
        int num = 5;
        int index = 0;
        //Para que al llegar a 95 pare el bucle y no se incluya este
        while ((num * index) < 95) {
            //Para que empiece a tenenr en cuenta numeros a partir del 10 sin incluirlo 
            if ((num * index) > 10) {
                //Cada vez que hace el bucle imprime un numero
                System.out.println(num * index);
            }
            index++;
        }        
    }
    
    /**
     * Imprime por pantalla la suma de los números comprendidos entre el 0 y el 10 (ambos incluidos)
     */
    public void sumValues()
    {
        int index = 0;
        int suma = 0;
        //El bucle parara al llegar a 11
        while (index <= 10) {
            suma = index + suma;
            index++;
        }
        System.out.println("La suma de los numeros entre 0 y 10 es: " + suma);
    }
    
    /**
     * Se piden dos parámetros enteros a y b y devuelva la suma de los valores comprendidos entre dichos parámetros (ambos incluidos)
     * En caso de que b sea menor que a, el programa debe intercambiarlos.
     */
    public int sumValuesInterval(int a, int b)
    {
        int suma = 0;
        //Doy por supesto que a es mayor que b
        int numMayor = a;
        int numMenor = b;        
        //Si b es mayor que a los cambia de posicion
        if (b > a) {
            numMayor = b;
            numMenor = a;
        }
        int index = numMenor;
        //El bucle se detendra al llegar a numMayor + 1. Asi numMayor estara incluido
        while (index <= numMayor) {
            suma = index + suma;
            index++;
        }
        //Cuando los numeros son iguales te lo indicara
        if (numMayor == numMenor) {
            suma = numMayor;
        }
        //Si algun numero es negativo saltara un aviso
        if (numMayor < 0 || numMenor < 0) {
            System.out.println("Los dos numeros introducidos deben ser 0 o mayores que 0");
            suma = -1;
        }
        return suma;
    }
    
    /**
     * Metodo que devuelva verdadero si el parámetro n es primo o falso en caso contrario. 
     */
    public boolean isPrime(int n)
    {
        int index = 1;
        //Doy por supuesto que n no es primo
        boolean isPrime = false;        
        //El bucle se detendra al llegar n -1. Ya que este no hace falta comprobarlo
        while (index < n) {
            if ((n / index) != 0){
                isPrime = true;
            }
            index++;
        }
        return isPrime;
    }
}
