
package klasaobject;


public class Main {

    public static void main(String[] args) {
       
        Object[] punkty = new Punkt[4];
        
        punkty[0] = new Punkt(5, 6);
        punkty[1] = new Punkt(51, 67);
        punkty[2] = new Punkt(5, 6);
        punkty[3] = new Punkt(5, 4);
        
        for (Object pkt : punkty)
        {
            System.out.println(pkt);
        }
        
        System.out.println(punkty[0].equals(punkty[2]));
    }
    
}

class Punkt 
{
    private int x;
    private int y;
    
    Punkt()
    {
        
    }
    
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    int getX()
    {
        return x;
    }
    
    int getY ()
    {
        return y;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if (this == o)
            return true;
        
        if (o == null)
            return false;
        
        if (this.getClass() != o.getClass())
            return false;
        
       
        
        Punkt przyslany = (Punkt)o;   
        return this.x == przyslany.x && this.y == przyslany.y;

    }
    
    @Override
    public String toString() 
    {
          return this.getX() + " " + this.getY();      
    }
}