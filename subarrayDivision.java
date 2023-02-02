class Result{
    public static int birthday(List<Integer> s, int d, int m) {
        int ct = 0;
        int sum = 0;
        for(int i=0; i<m-1; i++){
            sum+=s.get(i);
        }
        for(int j=m-1; j<s.size(); j++){
            sum -= (j-m)<0 ? 0 : s.get(j-m);
            sum += s.get(j);
            if(sum==d)
                ct++;
        }
        return (ct);
    }
}

