class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        answer = s.toCharArray().sortedDescending().joinToString("")
        
        return answer
    }
}