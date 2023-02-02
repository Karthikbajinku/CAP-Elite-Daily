class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        List<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
            else{
                map.put(arr.get(i),1);
            }
        }
        for(int i=0;i<100;i++){
            if(map.containsKey(i)){
                list.add(map.get(i));
            }
            else list.add(0);
        }
        return list;   
    }
}
