class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(Integer i: ar){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        int count =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count+=(entry.getValue()/2);
        }
        return count;
    }

}
