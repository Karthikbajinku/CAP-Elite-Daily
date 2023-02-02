class Result {

    public static void plusMinus(List<Integer> arr) {
        float pos=0;
        float neg=0;
        float zer=0;
        for(int i=0;i<arr.size();i++){
            if (arr.get(i)>0) pos+=1;
            else if(arr.get(i)<0) neg+=1;
            else zer+=1;
        }   
        System.out.println(String.format("%.6f",(pos)/arr.size()));
        System.out.println(String.format("%.6f",(neg)/arr.size()));
        System.out.println(String.format("%.6f",(zer)/arr.size()));
    }
}

