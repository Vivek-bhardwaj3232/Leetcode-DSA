class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        String out = "";
        for(int i=0; i<words.length-1; i++){
            out += reverse(words[i]) + " ";
        }
        return out + reverse(words[words.length-1]);
    }

    private String reverse(String t){
        String res = "";
        for(int i=t.length()-1; i>=0; i--){
            res += t.charAt(i);
        }
        return res;
    }
}