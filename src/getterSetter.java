public class getterSetter {
    // Access Modifiers - specifier where a property is accesible
    // 1. Private , 2. Default , 3.Protected , 4. Public
    // Getter - returns the value [accessors]
    // Setter - sets the value [mutators]
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
        getterSetter nimisha = new getterSetter();
        // nimisha.id = 45;
        // nimisha.name = "Nimisha"
        // then don't use private key word
        // anyone can change or manipulate your data
        nimisha.setName("Nimisha");
        System.out.println(nimisha.getName());
        nimisha.setId(55);
        System.out.println(nimisha.getId());
    }
}
