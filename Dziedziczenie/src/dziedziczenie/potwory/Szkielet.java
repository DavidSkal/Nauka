
package dziedziczenie.potwory;


public class Szkielet extends Potwor 
{
    public Szkielet ()
   {
       System.out.println("Wywołałeś domyślny konstruktor z  klasy >>>Szkielet"); 
        System.out.println("");
   }
   
   public Szkielet(int predkoscChodzenia, int zywotnosc)
   {
       super (predkoscChodzenia, zywotnosc);
       System.out.println("Wywołałeś niedomyślny konstruktor z klasy >>>Szkielet");
       System.out.println("");
   }
   
   public Szkielet(int predkoscChodzenia, int zywotnosc, String typBroni)
   {
       super (predkoscChodzenia, zywotnosc, typBroni);
       System.out.println("Wywołałeś niedomyślny konstruktor z klasy >>>Szkielet");
       System.out.println("");
   }
   
   protected void atakuj()
   {
       super.atakuj();
       System.out.println("Wywołałeś metode ATAKUJ z klasy SZKIELET");
   }
}
