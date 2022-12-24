class monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){

    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    @Override
    public void eat(){
        System.out.println("Cake");
    }
    public void sleep(){

    }
}
public class humanFeatures {
    public static void main(String[] args) {
        human nimisha = new human();
        nimisha.eat();
        monkey animal = new human();
        animal.jump(); //polymorphism
    }
}
