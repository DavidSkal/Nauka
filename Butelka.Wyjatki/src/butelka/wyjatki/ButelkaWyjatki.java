
package butelka.wyjatki;

public class ButelkaWyjatki {

    public static void main(String[] args) {
        
         Butelka[] butelka = new Butelka[50];
        
        for ( int a = 0; a < butelka.length; a++)
        {
            butelka [a] = new Butelka (5,10);
        }
        System.out.println();
        
        System.out.println("Butelka nr2 ma litrów: " + butelka[2].getIleLitrow());
        butelka[2].wlej(3);
        System.out.println("Butelka nr2 ma litrów: " + butelka[2].getIleLitrow());
        System.out.println();
        
        System.out.println("Butelka nr3 ma litrów: " + butelka[3].getIleLitrow());
        butelka[3].wylej(2);
        System.out.println("Butelka nr3 ma litrów: " + butelka[3].getIleLitrow());
        System.out.println();
        
        butelka[4].przelej(3, butelka[5]);
        System.out.println("Z butelkia nr4: " + butelka[4].getIleLitrow());
        System.out.println("Do butelki nr5: " + butelka[5].getIleLitrow());
        System.out.println();
        
        butelka[0].przelej(5, butelka[1]);
        System.out.println("Z butelki nr0: " + butelka[0].getIleLitrow());
        System.out.println("Do butelki nr1: " + butelka[1].getIleLitrow());
        System.out.println();
        
        butelka[8].wlej(3);
        System.out.println("Brakuje: " + butelka[8].getIleWodyBrakujeDoPelna());
    }
    
}
        
class Butelka
{
    private double ileLitrow;
    private double pojemnosc;
    
    Butelka (double ileLitrow, double pojemnosc)
    {
        
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
        System.out.println("Butelka zawiera: " + ileLitrow + " L" + " max pojemnosc: " + pojemnosc + " L" );
    }
    
    double getIleLitrow ()
    {
        return ileLitrow;
    }
    
    double getPojemnosc ()
    {
        return pojemnosc;
    }
    
    boolean wlej (double ile)
    {
        if (ile + ileLitrow > pojemnosc)
            System.out.println("Butelka ma za małą pojemność");
        else
            this.ileLitrow += ile;
        System.out.println("Wlano: " + ile);
           
        
        return true;
    }
    
    void wylej (double ile)
    {

            this.ileLitrow -= ile;
            System.out.println("Wylno: " + ile);
        
        
    }
    
    void przelej (double ile, Butelka gdziePrzelac)
    {
        
        if ( ile > gdziePrzelac.getIleWodyBrakujeDoPelna())
            ile = gdziePrzelac.getIleWodyBrakujeDoPelna();
        
        else if ( ile < this.getIleWodyBrakujeDoPelna());
        {
             this.wylej(ile);
             gdziePrzelac.wlej(ile);
        }   
            
        
    }
    
    double getIleWodyBrakujeDoPelna()
    {
         return this.pojemnosc - this.ileLitrow;
    }
    
}
    
    
