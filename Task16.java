//create a gorilla class which implements the Animal interface
//lather, rinse, repeat
//pet at your own risk
//put gorilla food into cage

public class Task16 {
    public static void main(String[] args) {
        Animal g = new Gorilla();
        g.feed(true);
        g.groom();
        g.pet();
    }
}

interface Animal{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal{
    public Gorilla(){
                
    }

    public boolean feed(boolean timeToEat){
        if (timeToEat){
            System.out.println("put gorilla food into cage");
        }
        return timeToEat;
    }

    public void groom(){
        System.out.println("lather, rinse, repeat");
        
    }

    public void pet(){
        System.out.println("pet at your own risk");
    }
}