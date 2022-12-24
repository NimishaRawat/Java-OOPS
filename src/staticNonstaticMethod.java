public class staticNonstaticMethod {
    //if we don't use static key word it means it's a non-shareable method
    // we need to create an object when me make non-static methods
    int mul(int a,int b){
        return a*b;
    }
    static int sum(int i,int j){
        return i+j;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int s = sum(a,b);
        staticNonstaticMethod obj = new staticNonstaticMethod();
        int c = obj.mul(a,b);
        System.out.println(s);
        System.out.println(c);
    }
}
