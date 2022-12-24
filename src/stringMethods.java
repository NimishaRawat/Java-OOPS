public class stringMethods {
    public static void main(String[] args) {
        String name = "Nimisha";
        System.out.println(name);
        String name1 = new String("Nimisha");
        System.out.println(name1);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String n = "         Nimisha        ";
        System.out.println(n);
        System.out.println(n.trim());
        System.out.println(name.substring(3));
        // begining index is 3
        System.out.println(name.substring(1,5));
        // only print the characters form index 1 to 5
        System.out.println(name.replace('m','n'));
        // replace the old character m with new character n
        // same method can be use for sub string
        System.out.println(name.startsWith("Nim"));
        // return true if it does start with Nim  otherwise false
        System.out.println(name.endsWith("Nim"));
        // return true if it does end with Nim  otherwise false
        System.out.println(name.charAt(2));
        // character at 2nd index
        System.out.println(name.indexOf("m"));
        // index of the mentioned character it also works for substring
        String modifiedName = "Nimimisha";
        System.out.println(modifiedName.indexOf("mi",4));
        //you can also define an index from where it can start searching
        System.out.println(modifiedName.lastIndexOf("mi"));
        // it will check the first occurence of mi form last
        System.out.println(name.equals(modifiedName));
        //check that both strings are equal or not
        //it's better to use equals method then using == operator
        System.out.println(name.equalsIgnoreCase("nIMISHA"));
        // it will not consider the uppercase or lowercase
        
    }
}
