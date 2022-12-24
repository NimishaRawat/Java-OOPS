public class countNumber {
        public static int countSpecificNumber(int n,int m){
            int rem =0,count=0,temp=0;
            if(n>m){
                return -1;
            }
            while(n<=m){
                temp = n;
                while(temp!=1){
                    rem = temp % 10;
                    temp = temp/10;
                    if(rem==1 || rem==4 || rem==9){
                        count++;
                    }
                }
                n++;
            }
            return count;
        }
        public static void main(String[] args) {
            int start = 100, end = 200;
            int ans = countSpecificNumber(start,end);
            System.out.println(ans);
        }
}
