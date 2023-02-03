class Result {
    public static int pageCount(int n, int p) {
        int f= p/2;
        int b= n%2==0 ? (n-p+1)/2 : (n-p)/2 ;
        return Math.min(f,b);
    }

}
