public class constructors {
        // Constructor - A member function used to initialize an object
        // while creating it
        // In order to write our own constructor , we define a method with name
        // same as class name
        // constructor invokes automatically
        public constructors(String s){ // constructor with arguments
            id = 77;
            name = s;
        }
        public constructors(){ // constructor without arguments , overloaded
            id = 77;
            //name = s;
        }
        private int id;
        private String name;
        public String  getName(){
            return name;
        }
        public void setName(String n){
            this.name = n;
        }
        public void setId(int i){
            this.id = i;
        }
        public int getId(){
            return id;
        }
        public static void main(String[] args) {
            constructors nimisha = new constructors("Nimisha");
            //nimisha.setName("Nimisha"); - explicite calling
            //nimisha.setId(55);
            System.out.println(nimisha.getId());
            System.out.println(nimisha.getName());

            //Note : Contructors can take parameters without being
            // overloaded
            // There can be more than two overloaded constructor
    }
}
