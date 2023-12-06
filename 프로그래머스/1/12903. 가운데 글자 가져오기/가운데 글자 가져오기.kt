class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        answer = s.substring((s.length-1)/2, s.length/2+1)
        
        return answer
    }
}