public class starIteration {
    //output
//    *
//    **
//    ***
//    ****
    static void starPattern(int n){
        if(n>0){
            starPattern(n-1);
        }
        for(int i =0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    //starPattern(8)
    //starPattern(7) + print star 8 times
    //starPattern(6) + print star 7 times
    // and so on ...
    public static void main(String[] args) {
        int x=8;
        starPattern(x);
    }
}
