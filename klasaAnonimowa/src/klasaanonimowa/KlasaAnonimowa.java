
package klasaanonimowa;


public class KlasaAnonimowa {

    
    public static void main(String[] args) {
       
        Przycisk p = new Przycisk();
        
        p.dodajAkcje(new ZachowaniePoWcisnieciu() 
        { 
            public void akcja()
            {
                System.out.println("Jestem z klasy anonimowej");
            }
        }
        );
    }
    
}

interface ZachowaniePoWcisnieciu
{
    void akcja();
}

class Przycisk 
{

   void dodajAkcje(ZachowaniePoWcisnieciu z)
   {
       z.akcja();
   }
    
}

