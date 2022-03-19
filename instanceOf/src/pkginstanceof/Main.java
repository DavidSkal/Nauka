
package pkginstanceof;


public class Main {

   
    public static void main(String[] args) {
        
        Osoba osoba[] = new Osoba[10];
        
        osoba [0] = new Pracownik("Dawid", "Skalski", 1000000);
        osoba [1] = new Student("Wiktor", "Stanisławski");
        osoba [3] = new Pracownik("Patrycja", "Bednarek", 24567);
        osoba [4] = new Pracownik("Patryk", "Bed", 6000);
        osoba [5] = new Pracownik("Mona", "Narek", 3900);

        for (Osoba person: osoba)
        {
            if (person instanceof Pracownik)
            {
                ((Pracownik)person).pracuj();
                ((Pracownik)person).pobierzOpis();
            }
            
            else if (person instanceof Student)
            {
                Student tmp = (Student)person;
                tmp.studiuj();
                tmp.pobierzOpis();
            }
        }
 
    }
    
}

abstract class Osoba
{
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void pobierzOpis();
}

class Pracownik extends Osoba
{
    double wynagrodzenie;
    
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super (imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
      
    }
    @Override
    void pobierzOpis()
    { 
        System.out.println("Jestem Pracownikiem");
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Wynagrodzenie: " + this.wynagrodzenie);
        System.out.println("");
    }
    void pracuj()
    {
        System.out.println("Ja pracuje");
    }
}

class Student extends Osoba
{
    Student ( String imie, String nazwisko)
    {
        super (imie, nazwisko);
        
    }
    @Override
    void pobierzOpis()
    {
        System.out.println("Jestem studentem");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("");
    }
    void studiuj ()
    {
        System.out.println("Ja studiuje");
    }
}