class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<words.length; i++){
            ans.append(reverse(words[i]));

            if(i != words.length-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }

    private String reverse(String word){
        StringBuilder res = new StringBuilder(word);
        return res.reverse().toString();
    }
}