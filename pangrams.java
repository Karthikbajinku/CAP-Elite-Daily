class Result {
    public static String pangrams(String s) {
        String str = s.replaceAll("\\s", "");
        str = str.toLowerCase();
        String x="";
        for(char i='a';i<='z';i++)
            if(str.indexOf(i)!=-1) x=x+i;
        
        if(!(x.length()==26)){
            return "not pangram";
        }
        else return "pangram";    
    }
}
