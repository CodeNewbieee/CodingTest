class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        var sum1 : Int = 0
        var sum2 : Int = 0
        for(num in numbers) {
            sum1 += num
        }
        for(i in 0..9) {
            sum2 += i
        }
        
        answer = sum2 - sum1
        
        return answer
    }
}