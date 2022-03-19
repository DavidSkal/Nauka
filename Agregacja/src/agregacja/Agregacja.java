
package agregacja;

/**
 *
 * @author Dawid
 */
public class Agregacja {

    
    public static void main(String[] args) {
        
        Pracownik p = new Pracownik("Dawid", new Adres("Szczerców", "Żeromskiego", 19));
        System.out.println(p);
    }
    
}


class Pracownik
{
    String imie;
    Adres adres;                    //Tutaj powstaje AGREGACJA - To inaczej łączenie w całość (tutaj połączyłem klase Adress z Pracownikiem za pomocą stworxenia właściwości typu klasowego)

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return this.imie + ": " + adres.miejscowosc + " "+adres.ulica + adres.nrDomu;
    }
    
    
    
}

class Adres
{
    String miejscowosc;
    String ulica;
    int nrDomu;
    
    public Adres(String miejscowosc, String ulica, int nrDomu)
    {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }
}