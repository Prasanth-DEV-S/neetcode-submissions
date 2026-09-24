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
    if (len != str2.length()) return false;

    // 1. Bulk copy characters to stack arrays via native memory copy (avoids chatAt bounds checking)
    char[] chars1 = new char[len];
    char[] chars2 = new char[len];
    str1.getChars(0, len, chars1, 0);
    str2.getChars(0, len, chars2, 0);

    int[] counts = new int[26];

    // 2. Linear Scan with direct array lookups (Maximizes JVM loop unrolling and CPU pipelining)
    for (int i = 0; i < len; i++) {
        int idx1 = (chars1[i] | 32) - 97; // 97 is ASCII 'a'
        int idx2 = (chars2[i] | 32) - 97;
        
        counts[idx1]++;
        counts[idx2]--;
    }

    // 3. Fast check: Anagrams must net out to zero
    for (int count : counts) {
        if (count != 0) return false;
    }

    return true;
}

}