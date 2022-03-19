
package finalkeyword;

import java.util.Date;


public class Main {

    
    public static void main(String[] args) {
        
        Pracownik p = new Pracownik ();
        
        System.out.println(p.dataZatrudnienia);
    }
    
}

abstract class Osoba
{
    
}

class Pracownik extends Osoba
{
    final Date dataZatrudnienia;
    
    Pracownik()
    {
           this.dataZatrudnienia = new Date();
    }
    
    Pracownik (Date data)
    {
        this.dataZatrudnienia = data;
    }
    
}