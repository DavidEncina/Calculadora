
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
}
