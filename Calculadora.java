
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
        while ((num * index) < 95) {
            if ((num * index) > 10) {
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
        while (index <= 10) {
            suma = index + suma;
            index++;
        }
        System.out.println("La suma de los numeros entre 0 y 10 es: " + suma);
    }
}
