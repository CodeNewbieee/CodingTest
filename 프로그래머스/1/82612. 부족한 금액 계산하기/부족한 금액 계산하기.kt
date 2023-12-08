class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer : Long = 0
        //놀이기구 총 이용 금액
        for(i in 1..count) {
            answer += price*i
        }
        
        return if(answer <= money) 0 else answer-money
    }
}