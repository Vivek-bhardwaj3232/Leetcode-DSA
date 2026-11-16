class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = p.length();
        for(int i=0; i<=s.length()-k; i++){
            String sub = s.substring(i,i+k);
            if(anagram(p,sub)){
                list.add(i);
            }
        }
        return list;
    }
    private boolean anagram(String a, String b){
        int ch1[] = new int[26];
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            ch1[ch-'a']++;
        }

        int ch2[] = new int[26];
        for(int i=0; i<b.length(); i++){
            char ch = b.charAt(i);
            ch2[ch-'a']++;
        }
        return Arrays.equals(ch1,ch2);
    }
}