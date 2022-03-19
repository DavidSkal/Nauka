
package dziedziczenie.potwory;


public class Potwor 
{
   protected String rodzajBroni;
   protected int predkoscChodzenia;
   protected int zywotnosc;
   
   public Potwor ()
   {
       System.out.println("Wywołałeś domyślny konstruktor z  klasy >>>Potwor");
   }
   
   public Potwor(int predkoscChodzenia, int zywotnosc)
   {
       this.predkoscChodzenia = predkoscChodzenia;
       this.zywotnosc = zywotnosc;
       System.out.println("Prędkość chodzenia: " + predkoscChodzenia + " Żywotność: " + zywotnosc);
       System.out.println("Wywołałeś niedomyślny konstruktor z  klasy >>>Potwor");
       
   }
   
   public Potwor(int predkoscChodzenia, int zywotnosc, String rodzajBroni)
   {
       this.rodzajBroni = rodzajBroni;
       this.predkoscChodzenia = predkoscChodzenia;
       this.zywotnosc = zywotnosc;
       System.out.println("Prędkość chodzenia: " + predkoscChodzenia + " Żywotność: " + zywotnosc + " Rodzaj broni: " + rodzajBroni);
       System.out.println("Wywołałeś niedomyślny konstruktor z  klasy >>>Potwor");
       
   }
   
   protected void atakuj()
   {
       System.out.println("Wywołałeś metode ATAKUJ z klasy POTWOR");
   }
   
   public String toString()
   {
       return "Jesteśmy potworami";
   }
}
