/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afnumerosromanos;

import java.util.Scanner;

/**
 *
 * @author jhon
 */
public class AFNumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        AutomataFinito af = new AutomataFinito();
        String o = "s";
        while(o.equals("s"))
        {
            System.out.println("Por favor ingrese un número romano ");
            String numRomano = scan.nextLine();
            numRomano=numRomano.toUpperCase();
            if(!af.isValid(numRomano))
            {
                System.out.println("Los caracteres ingresados no son validos ");
                return;
            }
            af.numRomano=numRomano;
            boolean response = af.isSuccess();
            if(response)
            {
                System.out.println("Número romano valido ");
            }
            else
            {
                System.out.println("Número romano NO invalido");
            }
            
             System.out.println("¿Desea ingresar otro número romano ? Sí (s) o presione otra tecla en caso contrario");
             o= scan.nextLine();
        }
        
    }
    
}
