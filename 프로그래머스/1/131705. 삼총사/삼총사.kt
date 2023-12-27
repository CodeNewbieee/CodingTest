class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0

        for(i in 0 until number.size) {
            for(j in 1 until number.size){
                if(i<j){
                    for(k in 2 until number.size) {
                        if(j<k && number[i]+number[j]+number[k]==0) {
                            answer++
                        }
                    }
                }
            }
        }

        return answer
    }
}