public class Hangar {
    public static void main(String[] args) {
        Car peugeot = new Car("peugeot", 100000);
        Boat titanic = new Boat("Titanic", 100);

        System.out.println(peugeot.doStuff());  
        System.out.println(titanic.doStuff()); 
                
    }
}