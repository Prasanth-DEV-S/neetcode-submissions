class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length() ){return false ;}
//         int[] charCount = new int[26];
//         s = s.toLowerCase();
//         t = t.toLowerCase();

//         for(int i =0; i< s.length() ; i++){
//             charCount[s.charAt(i) - 'a']++;
//             charCount[t.charAt(i) - 'a']--;
//         }

//         for(int count : charCount){
//             if(count != 0){
//                 return false ;
//             }
//         }
//         return true;
//     }
// }
public static boolean isAnagram(String str1, String str2) {
    int len = str1.length();
    // 1. O(1) Fast-fail check
    if (len != str2.length()) {
        return false;
    }

    // 2. Exact size array for alphabet tracking
    int[] charCounts = new int[26];

    // 3. Process both strings simultaneously without creating new String objects
    for (int i = 0; i < len; i++) {
        char c1 = str1.charAt(i);
        char c2 = str2.charAt(i);

        // Bitwise operations for high-speed, allocation-free lowercase conversion
        // (c1 | 32) turns uppercase ASCII (e.g., 'A'=65) into lowercase (e.g., 'a'=97)
        int idx1 = (c1 | 32) - 'a';
        int idx2 = (c2 | 32) - 'a';

        // Optional safety: Ignore non-alphabet characters or throw early if needed
        if (idx1 >= 0 && idx1 < 26) charCounts[idx1]++;
        if (idx2 >= 0 && idx2 < 26) charCounts[idx2]--;
    }

    // 4. Verify all counts returned to net zero
    for (int count : charCounts) {
        if (count != 0) {
            return false;
        }
    }
    return true;
}
}