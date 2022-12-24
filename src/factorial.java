public class factorial {
    //recursive approach
    static int fact(int n){
        //base case
        if(n==0 || n ==1){
            return 1;
        }
        return n * fact(n-1);
    }
    // iterative approach
    static int iterativeFact(int n){
        int mul = 1;
        for(int i = 1 ;i<=n;i++){ // 1 to n
            mul *= i;
        }
        return mul;
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Factorial of "+x+" = "+ fact(x));
        System.out.println("Factorial of "+x+" using iterative appoarch = "+ iterativeFact(x));
    }
}
