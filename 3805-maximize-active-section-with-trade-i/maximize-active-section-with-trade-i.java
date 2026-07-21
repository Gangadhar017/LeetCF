class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        List<Integer> li = new ArrayList<>();
        int len = 0 ;
        for(char c :s.toCharArray()){
            if(c=='1'){
                if(len !=0 ){
                    li.add(len);
                    len = 0 ;

                }
            }
            else {
                len++;
            }
        }
        if(len !=0){
            li.add(len);
        }
        int cnt = 0 ;
        for(char c : s.toCharArray()){
            if(c=='1'){
                cnt++;
            }
        }
        if(li.size()<= 1){
            return cnt;
        }
        int mx =0;
        for(int i=0;i<li.size()-1; i++){
            mx = Math.max(mx,li.get(i) + li.get(i + 1));
        }
        return cnt + mx;
    }
}
