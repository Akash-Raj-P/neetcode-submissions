class Solution {
    
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        boolean f = false;
        int[] seen = new int[26];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            seen[ch - 'a']++;
            
            seen[(t.charAt(i)) - 'a']--;
        }

        // for(int i=0;i<t.length();i++){
        // }

        for(int i=0;i<seen.length;i++){
            if(seen[i] != 0){
                f = true;
                return false;

            }
        }

        if(!f){
            return true;
        }

        return false;
    
    
    }
}
