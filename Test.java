
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {

    }

    /**
     * Testea el metodo sumValuesInterval
     */ 
    public void testSumValuesInterval()
    {
        Calculadora calculad1 = new Calculadora();
        String correcto = "correcto";

        if ((calculad1.sumValuesInterval(1, 3)) == 6) {
            System.out.println("Comprobando sumValuesInterval(1, 3)... resultado correcto 6 / resultado metodo " + calculad1.sumValuesInterval(1, 3) + "...OK");
        }
        else {
            System.out.println("Comprobando sumValuesInterval(1, 3)... resultado incorrecto -1 / resultado metodo " + calculad1.sumValuesInterval(1, 3) + "...ERROR");
            correcto = "incorrecto";            
        }        
        if ((calculad1.sumValuesInterval(3, 1)) == 6) {
            System.out.println("Comprobando sumValuesInterval(3, 1)... resultado correcto 6 / resultado metodo " + calculad1.sumValuesInterval(3, 1) + "...OK");
        }
        else {
            System.out.println("Comprobando sumValuesInterval(3, 1)... resultado incorrecto -1 / resultado metodo " + calculad1.sumValuesInterval(3, 1) + "...ERROR");
            correcto = "incorrecto";            
          } 
        if ((calculad1.sumValuesInterval(2, 2)) == 2) {
            System.out.println("Comprobando sumValuesInterval(2, 2)... resultado correcto 2 / resultado metodo " + calculad1.sumValuesInterval(2, 2) + "...OK");
        }
        else {
            System.out.println("Comprobando sumValuesInterval(2, 2)... resultado incorrecto -1 / resultado metodo " + calculad1.sumValuesInterval(2, 2) + "...ERROR");
            correcto = "incorrecto";            
        } 
        if ((calculad1.sumValuesInterval(-1, 3)) == -1) {
            System.out.println("Comprobando sumValuesInterval(-1, 3)... resultado correcto -1 / resultado metodo " + calculad1.sumValuesInterval(-1, 3) + "...OK");
        }
        else {
            System.out.println("Comprobando sumValuesInterval(-1, 3)... resultado incorrecto numero > 0 / resultado metodo " + calculad1.sumValuesInterval(-1, 3) + "...ERROR");
            correcto = "incorrecto";
        }  
        if ((calculad1.sumValuesInterval(1, -3)) == -1) {
            System.out.println("Comprobando sumValuesInterval(1, -3)... resultado correcto -1 / resultado metodo " + calculad1.sumValuesInterval(1, -3) + "...OK");
        }
        else {
            System.out.println("Comprobando sumValuesInterval(1, -3)... resultado incorrecto numero > 0 / resultado metodo " + calculad1.sumValuesInterval(1, -3) + "...ERROR");
            correcto = "incorrecto";
        } 
        if ((calculad1.sumValuesInterval(-11, -33)) == -1) {
            System.out.println("Comprobando sumValuesInterval(-11, -33)... resultado correcto -1 / resultado metodo " + calculad1.sumValuesInterval(-11, -33) + "...OK");
        }
        else {
            System.out.println("Comprobando sumValuesInterval(1, 3)... resultado incorrecto numero > 0 / resultado metodo " + calculad1.sumValuesInterval(-11, -33) + "...ERROR");
            correcto = "incorrecto";
        }
        if (correcto.equals("incorrecto")) {
            System.out.println("El método NO funciona correctamente");
        }
        else {
            System.out.println("El método SI funciona correctamente");
        }
    }

    /**
     * Testea el metodo isPrime
     */
    public void testIsPrime()
    {
        Calculadora calculad1 = new Calculadora();

        boolean resultado = false;
        String correcto = "correcto";
        if ((calculad1.isPrime(3)) == true) {
            resultado = true;
            System.out.println("Comprobando isPrime(3)... resultado correcto true / resultado metodo " + resultado + " ...OK");
        }
        else {
            System.out.println("Comprobando isPrime(3)... resultado correcto true / resultado metodo " + resultado + " ...ERROR");
            correcto = "incorrecto";
        }
        if ((calculad1.isPrime(4)) == false) {
            resultado = false;
            System.out.println("Comprobando isPrime(4)... resultado correcto false / resultado metodo " + resultado + " ...OK");
        }
        else {
            System.out.println("Comprobando isPrime(4)... resultado correcto false / resultado metodo " + resultado + " ...ERROR");
            correcto = "incorrecto";
        }
        if ((calculad1.isPrime(7)) == true) {
            resultado = true;
            System.out.println("Comprobando isPrime(7)... resultado correcto true / resultado metodo " + resultado + " ...OK");
        }
        else {
            System.out.println("Comprobando isPrime(7)... resultado correcto true / resultado metodo " + resultado + " ...ERROR");
            correcto = "incorrecto";
        }
        if ((calculad1.isPrime(40)) == false) {
            resultado = false;
            System.out.println("Comprobando isPrime(40)... resultado correcto false / resultado metodo " + resultado + " ...OK");
        }
        else {
            System.out.println("Comprobando isPrime(40)... resultado correcto true / resultado metodo " + resultado + " ...ERROR");
            correcto = "incorrecto";
        }
        if ((calculad1.isPrime(13)) == true) {
            resultado = true;
            System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo " + resultado + " ...OK");
        }
        else {
            System.out.println("Comprobando isPrime(13)... resultado correcto true / resultado metodo " + resultado + " ...ERROR");
            correcto = "incorrecto";
        }
        if ((calculad1.isPrime(150)) == false) {
            resultado = false;
            System.out.println("Comprobando isPrime(150)... resultado correcto true / resultado metodo " + resultado + " ...OK");
        }
        else {
            System.out.println("Comprobando isPrime(150)... resultado correcto true / resultado metodo " + resultado + " ...ERROR");
            correcto = "incorrecto";
        }
        if (correcto.equals("incorrecto")) {
            System.out.println("El método NO funciona correctamente");
        }
        else {
            System.out.println("El método SI funciona correctamente");
        }
    } 
}

