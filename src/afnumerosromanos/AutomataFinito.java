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
    private String estadoActual;
    
    public boolean isSuccess()
    {
        if(numRomano == null || numRomano.isEmpty())
        {
            return false;
            
        }
    
        //Aqui va while con case para evaluar la variable numRomano
        return true;
    
    }
    
    public boolean isValid(String num)
    {
        int i=0;
        boolean valid = false;
        while(num.length()<i)
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
                        break;
            }
        
        }
        return valid;
    
    }
    
    
}
