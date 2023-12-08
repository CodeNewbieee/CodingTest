class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer : Long = 0
        var totalPrice : Long = 0
        //놀이기구 총 이용 금액
        for(i in 1..count) {
            totalPrice += price*i
        }
        
        if(totalPrice <= money) answer = 0
        else answer = totalPrice - money
        
        return answer
    }
}