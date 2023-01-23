class Solution {
    public String minWindow(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        Map<Character,Integer>map=new HashMap<>();       
        for(int k=0;k<tl;k++){
            map.put(t.charAt(k),map.getOrDefault(t.charAt(k),0)+1);
        }
        String res="";
        int len=Integer.MAX_VALUE;
        int i=0,j=0;
        int count=map.size();
        while(j<sl){
            if(map.get(s.charAt(j))!=null){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0)
                    count--;
            }
            if(count==0){
                while(count==0){
                    if(len>j-i+1){
                        res=s.substring(i,j+1);
                        len=j-i+1;
                    }
                    if(map.get(s.charAt(i))!=null){
                        map.put(s.charAt(i),map.get(s.charAt(i))+1);
                            if(map.get(s.charAt(i))==1)
                                count++;
                    }
                    i++;
                }
            }
            j++;
        }
        return res;
    }
}