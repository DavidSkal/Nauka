
package interfejsy;

import java.util.Arrays;


public class Main {

    
    public static void main(String[] args) {
       
       
        
//        System.out.println(((Pracownik)a).getWynagrodzenie());  // Tutaj musieliśmy użyć " DOWNCASTINGU " czyli rzutowania w dół.
//        
//        System.out.println(nazwaInterfejsu.Pi);  // Mogę wywował boo jest Static.
//        System.out.println("");
        
        
        int[] tab = new int[4];
        tab[0] = 4;
        tab[1] = 522;
        tab[2] = -44;
        tab[3] = 2;
        
        Arrays.sort(tab);
        System.out.println(tab[0]);
        System.out.println("");
        
        
        
        Pracownik[] pracownik = new Pracownik[4];
        pracownik [0] = new Pracownik(2000);
        pracownik [1] = new Pracownik(1000);
        pracownik [2] = new Pracownik(3000);
        pracownik [3] = new Pracownik(100);
        
        for (Pracownik p : pracownik)
        {
                    System.out.println(p.getWynagrodzenie());
        }

        System.out.println(pracownik[0].compareTo(pracownik[1])); //Porównujemy czy wartośc wysłana do compareTo jest mniejszy bądź większa.
        System.out.println("");
        
        
        Arrays.sort(pracownik);             // Sortujemy tabele pracownik zeby wszystko było ułożone
        for (Pracownik p : pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }
        
        
    }
    
}

interface nazwaInterfejsu
{
    double Pi =3.14; // Właściwość jest Static, Public, Final.
    void cos(); // Metona jest Public i Abstract. 
}


class Pracownik implements nazwaInterfejsu, Comparable
{
    private double wynagrodzenie;
    
    Pracownik (double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }
    
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    
    @Override
    public void cos() 
    {
        
    }

    @Override
    public int compareTo(Object o) 
    {
        Pracownik przyslany = (Pracownik)o;
        if (this.wynagrodzenie < przyslany.wynagrodzenie)
           return -1;
        else if (this.wynagrodzenie > przyslany.wynagrodzenie)
           return 1;
        
        return 0;
    }
     
}


