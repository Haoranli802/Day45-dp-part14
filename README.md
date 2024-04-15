# Day45-dp-part14

● 392.判断子序列 

两种做法

1.双指针，用一个指针维护t中s的字符下标，然后遍历t知道指针指向s的长度，那么代表t中包含s的所有字符并且有正确的顺序。

2.dp 先遍历s然后遍历t，如果s.charAt(i - 1) == t.charAt(j - 1)那么dp[i][j] = dp[i -  1][j - 1] + 1, 如果不相等，那么就把t回退一步dp[i][j] = dp[i][j - 1]。

● 115.不同的子序列  
