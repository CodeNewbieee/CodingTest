class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableSetOf<Int>()
        
        for(i in 0..numbers.size -1) {
            for (j in numbers.size -1 downTo 1) {
                if(i!=j) {
                   answer.add(numbers[i] + numbers[j])
                }
            }
        }
        var set = answer.toIntArray()
        set.sort()
        return set
    }
}