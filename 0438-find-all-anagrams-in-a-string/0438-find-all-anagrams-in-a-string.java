class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = p.length();
        int ch1[] = new int[26];
        for(char ch : p.toCharArray()){
            ch1[ch-'a']++;
        }

        int ch2[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            ch2[ch-'a']++;
            if(i<k-1){
                continue;
            }
            if(Arrays.equals(ch1,ch2)){
                list.add(i-k+1);
            }
            ch2[s.charAt(i-k+1)-'a']--;
        }
        return list;
    }
}