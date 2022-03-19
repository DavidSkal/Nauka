
package pkgfinal;

import java.util.Date;


public class data {

    
    public static void main(String[] args) {
        
        Pracownik p = new Pracownik("Dawid", "Skalski", 100000);
        System.out.println("przyjęty: " + p.dataZatrudnienia);
      
    }
    
}

class Pracownik 
{
    final Date dataZatrudnienia = new Date();
    double wynagrodzenie;
    String imie;
    String nazwisko;
    
  
    
    Pracownik (String imie, String nazwisko, double wynagrodzenie)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
        System.out.println("imie " + imie );
        System.out.println("nazwisko " + nazwisko );
        System.out.println("wynagrodzenie " + wynagrodzenie );
    }
    
    Date getDataZatrudnienia ()
    {
        return this.dataZatrudnienia;
    }

}


