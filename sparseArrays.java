class Result {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> res = new ArrayList<Integer>();
        for(String i: queries){
            int count=0;
            for(String j: strings){
                if(i.equals(j)){count+=1;}
            }
            res.add(count);
        }
        return res;
    }

}
