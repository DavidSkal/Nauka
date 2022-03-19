
package wyrazenielambda;

public class WyrazenieLambda {

   
    public static void main(String[] args) {
      
       ZachowaniePoWcisnieciu z = () -> 
       {
           System.out.println("Jestem z klasy Anonimowej");
       };
       
       ZachowaniePoWcisnieciu2 z2 = (a , b) -> a + b;
       
      Przycisk p = new Przycisk();
      p.dodajAkcje(z);
      
      p.dodajAkcje2(15, 10, z2);
      
    }
    
    
}

interface ZachowaniePoWcisnieciu
{
    void akcja();
}

interface ZachowaniePoWcisnieciu2
{
    int akcja2(int a, int b);
}



class Przycisk 
{

   void dodajAkcje(ZachowaniePoWcisnieciu z)
   {
       z.akcja();
   }
    
   int dodajAkcje2(int a, int b, ZachowaniePoWcisnieciu2 z)
   {
       z.akcja2(a ,b);
       return a + b;
   }
}
    
   
