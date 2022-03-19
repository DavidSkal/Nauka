
package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;


public class Dziedziczenie {

    public static void main(String[] args) {
       
        
        
        Potwor[] s = new Szkielet[2];
        
        s[0] = new Szkielet(20, 15, "bolt");
        s[1] = new Szkielet(200, 5, "sword");
        for (int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
        
        
        Potwor[] z = new Zombie[2];
        z[0] = new Zombie(20, 15);
        z[1] = new Zombie(60, 111);
        
        for (Potwor pot: z)
        {
            System.out.println(pot);
           
        }
        
     
        

       
       
    }
    
}
