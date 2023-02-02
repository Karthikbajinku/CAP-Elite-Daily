class Result {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        A.sort(null);
        B.sort(null);
        for(int i=0,j=A.size()-1;i<A.size();i++,j--){
            if(A.get(i)+B.get(j)<k){
                return "NO";
            }
        }
        return "YES";    
    }
}

