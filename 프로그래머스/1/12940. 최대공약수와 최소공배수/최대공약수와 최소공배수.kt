class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        var sameN = mutableListOf<Int>()
        var sameM = mutableListOf<Int>()


        // 최대 공약수 구하기
        for (i in 1..n) {
            if(n%i == 0) sameN.add(i)
        }

        for (i in 1..m) {
            if(m%i == 0) sameM.add(i)
        }

        var max = 0

        for (i in sameN){
            for (j in sameM) {
                if(i == j) max = j
            }
        }
        // 최소 공배수 구하기
        var min = (n*m)/max

        // 답 구하기
        answer = intArrayOf(max,min)

        return answer
    }
}