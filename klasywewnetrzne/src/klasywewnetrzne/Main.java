package klasywewnetrzne;

public class Main 
{

    public static void main(String[] args) 
    {
        
        A zewnetrzna = new A();
        
        A.B wewnetrzna = zewnetrzna.new B();
//      A.B wewnetrzna = new A.B();     <----------- W taki sposób możemy stówrzyć obiekt ale tylko gdy         klasa>>> " B " jest statyczna " Static " <<<
        
        A.C wewnętrzna2 = new A.C();
        
    }
    
}

class A// <----------------------------------------------------- klasy zewnętrzne nie mogą być statyczne !!!!
{
    A()
    {
        System.out.println("Jestem z klasy zewnętrznej A");    
    }
    
    class B// <----------------------------------------------------- klasy wewnętrzne/zagnieżdżone mogą być statyczne !!!!
    {
        B()
        {
            System.out.println("Jestem z Klasy wewnętrznej B");
        }
    }
    
    static class C
    {
        C()
        {
            System.out.println("Jesetm z klasy wewnętrznej/ zagnieżdzonej C");
        }
    }
}