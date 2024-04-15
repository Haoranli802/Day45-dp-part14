class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int index = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(index) == t.charAt(i)){
                index++;
            }
            if(index == s.length()) return true;
        }
        return index == s.length();
    }
}
//O(N), O(1) two pointers

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n > m) return false;
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else{
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[n][m] == n;
    }
}
//O(NM), O(NM) dynamic programming
