class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();

        if(m > n) return new ArrayList<>();

        int freq[] = new int[26];

        for(int i = 0; i<m ; i++){
            char ch = p.charAt(i);
            freq[ch - 'a']++;
        }
        int left = 0;
        int count = m;
        List<Integer> list = new ArrayList<>();

        for(int right = 0; right<n ; right++){
            char ch = s.charAt(right);

            if(freq[ch - 'a'] > 0){
                count--;
            }

            freq[ch - 'a']--;

            if(right - left + 1 > m){
                char removed = s.charAt(left);

                if(freq[removed - 'a'] >= 0){
                    count++;
                }

                freq[removed - 'a']++;
                left++;
            }
            if(count == 0){
                list.add(left);
            }

        }
        return list;
    }
}