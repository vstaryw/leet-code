package com.vstaryw.code;

/**
 * 无重复字符的最长子串
 */
public class L3_LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int[] hash = new int[256];
        int pre = 0, max = 0;
        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);
            if(hash[c] > pre){
                pre = hash[c];
            }
            int l = i - pre + 1;
            hash[c] = i + 1;
            if(l > max) {
                max = l;
            }
        }
        return max;
    }
}
