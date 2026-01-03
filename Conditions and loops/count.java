public class count {
    public static void main(String[] args) {
        int n=138393;
        int con=0;
        for(int i =0;i<=n;i++){
            int rem = n % 10;
            if(rem == 3){
                con++;
            }
            n = n/10;
        }
        System.out.println(con);
    }
}
