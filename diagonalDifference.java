class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int len = arr.size();
        int left = 0;
        int right = 0;
        
        for(int i = 0; i < len; i++) {
            left += arr.get(i).get(i);
            right += arr.get(len-1-i).get(i);
        }        
        return Math.abs(left - right);
    }
}
