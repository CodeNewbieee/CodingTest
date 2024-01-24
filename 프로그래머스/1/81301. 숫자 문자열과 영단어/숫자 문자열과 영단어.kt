class Solution {
    fun solution(s: String): Int {
        var str= s
        
        val list = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine")
        
        for(i in 0 until list.size) {
            str = str.replace(list[i], i.toString())
        }
        
        return str.toInt()
    }
}