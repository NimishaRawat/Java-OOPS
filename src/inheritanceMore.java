    class animals{
        // when a class inherits from a superclass , it inherits
        //parts of superclass methods and fields Java doesn,t support mutiple inheritance
        // i.e two classes can not be superclasses for a subclass
            String s;
    public void setSound(String s){
        System.out.print("I am setting sound ");
        this.s = s;
        }
    public String getSound(){
        return s;
        }
        }
    class dog extends animals{

        }
    class cat extends animals{

        }
    class cow extends animals{

        }
    public class inheritanceMore {
        public static void main(String[] args) {
            animals b = new animals(); // object of animals (parent) class
            dog d = new dog();
            d.setSound("Bwo");
            System.out.println(" of dog as "+ d.getSound());

            cat c = new cat();
            c.setSound("Mewo");
            System.out.println(" of cat as "+ c.getSound());

            cow co = new cow();
            co.setSound("Mow");
            System.out.println(" of cow as "+ co.getSound());
    }
}
