/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package afnumerosromanos;

/**
 *
 * @author jhon
 */
public class AutomataFinito {
    
    public String numRomano ;
    
    
    public boolean isSuccess()
    {
        boolean aceptacion = false;
        String estado = "INI";
        if(numRomano == null || numRomano.isEmpty())
        {
            return false;
            
        }
        
        //Aqui va while con case para evaluar la variable numRomano
        int i =0;
        
        while(numRomano.length()>i)
        {
            String simbolo=numRomano.substring(i,i+1);
            switch(estado){
                case  "INI":
                    aceptacion = false;
                    switch(simbolo){
                        case  "I":
                            estado = "1";
                            break;
                        case  "V":
                            estado = "5";
                            break;
                        case  "X":
                            estado = "10";
                            break;
                        case  "L":
                            estado = "50";
                            break;
                        case  "C":
                            estado = "3489100";
                            break;
                    }
                    break;
                case  "1":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "27";
                            break;
                        case  "V":
                            estado = "3489100";
                            break;
                        case  "X":
                            estado = "3489100";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                    }
                    break;
                case  "27":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "3489100";
                            break;
                        case  "V":
                            estado="E";
                            break;
                        case  "X":
                            estado="E";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                    }
                    break;
                case  "5":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "6";
                            break;
                        case  "V":
                            estado="E";
                            break;
                        case  "X":
                            estado="E";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                    }
                    break;
                case  "6":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "27";
                            break;
                        case  "V":
                            estado="E";
                            break;
                        case  "X":
                            estado="E";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                            
                    }
                    break;
                case  "10":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "1";
                            break;
                        case  "V":
                            estado = "5";
                            break;
                        case  "X":
                            estado = "20";
                            break;
                        case  "L":
                            estado = "304090";
                            break;
                        case  "C":
                            estado = "304090";
                            break;
                            
                    }
                    break;
                case  "20":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "1";
                            break;
                        case  "V":
                            estado = "5";
                            break;
                        case  "X":
                            estado = "304090";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                            
                    }
                    break;
                case  "50":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "1";
                            break;
                        case  "V":
                            estado = "5";
                            break;
                        case  "X":
                            estado = "60";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                            
                    }
                    break;
                case  "60":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "1";
                            break;
                        case  "V":
                            estado = "5";
                            break;
                        case  "X":
                            estado = "20";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                            
                    }
                    break;
                case "304090":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "1";
                            break;
                        case  "V":
                            estado = "5";
                            break;
                        case  "X":
                            estado="E";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                            
                    }
                    break ;
                case "3489100":
                    aceptacion = true;
                    switch(simbolo){
                        case  "I":
                            estado = "E";
                            break;
                        case  "V":
                            estado = "E";
                            break;
                        case  "X":
                            estado="E";
                            break;
                        case  "L":
                            estado="E";
                            break;
                        case  "C":
                            estado="E";
                            break;
                            
                    }
                    break ;
                case "E":
                    aceptacion = false;
                    break;
                default : //no ocurriria
                    aceptacion = false;
                    break;
            }
            i++;
        }
        if(estado.equals("E"))
        {
        aceptacion = false;
        }
        return aceptacion;
        
    }
    
    public boolean isValid(String num)
    {
        int i=0;
        boolean valid = false;
        while(num.length()>i)
        {
            char c = num.charAt(i);
            switch(c)
            {
                case 'I':
                    valid=true;
                    break;
                case 'V':
                    valid=true;
                    break;
                case 'X':
                    valid=true;
                    break;
                case 'L':
                    valid=true;
                    break;
                case 'C':
                    valid=true;
                    break;
                default:
                    return false;
                
            }
            i++;
        }
        return valid;
        
    }
    
    
}
