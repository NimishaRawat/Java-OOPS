public class variableArguments {
//    static int sum(int a,int b){
//        return a + b;
//    }
//    static int sum(int a,int b,int c){
//        return a + b+c;
//    }
//    static int sum(int a,int b,int c , int d){
//        return a + b+c+d;
//    }
    // instead of using all these methods you can use a single
    // method with variable arguments using array
    static int sum(int ...arr){
        //any number of arguments you pass will be packed in an array
        //available as int []arr;
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of nothing  = "+sum());
        System.out.println("Sum "+ sum(4,5));
        System.out.println("Sum "+ sum(4,5,6));
        System.out.println("Sum "+ sum(4,5,6,7));
    }
}
