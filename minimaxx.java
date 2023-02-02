class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        arr.sort(null);
        for(Integer in : arr) {
            sum += in;
        }
        System.out.println((sum - arr.get(arr.size()-1)) + " " + (sum  - arr.get(0)));

    }

}
