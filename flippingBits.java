class Result {
    public static long flippingBits(long n) {
        long x = n;
        long sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 32; i++){
            list.add(1);
        }
        int z = 1;
        while(x > 0){
            if(x%2 == 1){
                list.set(list.size()-z, 0);
            } 
            else {
                list.set(list.size()-z, 1);
            }
            x = x/2;
            z++;
        }
        while(list.size() > 0){
            sum += Math.pow(2,list.size()-1)*list.remove(0);
        }
        return sum;
    }

}

