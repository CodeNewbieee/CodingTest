class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        var add :Int = 0
        for(i in 0..signs.size-1) {
            if(signs[i] == true) {
                add = absolutes[i]
            } else {add = -absolutes[i]}
            answer += add
        }
        return answer
    }
}