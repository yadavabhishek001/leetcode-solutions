class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();

        if(m > n) return new ArrayList<>();

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i = 0; i<m ; i++){
            char ch = p.charAt(i);
            freq1[ch - 'a']++;
        }

        List<Integer> list = new ArrayList<>();
        int left = 0;
        int count = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<m ; i++){
            sb.append(s.charAt(i));
            freq2[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freq1,freq2)) list.add(0);
        
        for(int i = m ; i<n ; i++){
            char removed = s.charAt(i - m);
            freq2[removed - 'a']--;
            char ch = s.charAt(i);
            sb.append(ch);
            freq2[ch - 'a']++;
            if(Arrays.equals(freq1,freq2)) list.add(i - m + 1);
        }
        return list;
    }

    //     for(int right = 0; right < n ; right++){
    //         char ch = s.charAt(right);

    //         if(freq[ch] > 0){
    //             count++;
    //         }

    //         freq[ch]--;

    //         while(count == p.length()){

    //         }
    //     }
    // }
}