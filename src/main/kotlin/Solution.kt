


class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var answer: Int = 0
        val map = mutableMapOf<Int,Int>()
        rank.forEachIndexed { idx,value ->
            if(attendance[idx]) map.put(idx,value)
        }
        val resultMap = map.toList().sortedBy { it.second }
        answer = resultMap[0].first * 10000 + resultMap[1].first * 100 + resultMap[2].first * 1
        return answer
    }
}

fun main() {
    val s = Solution()
    s.solution(
        intArrayOf(3, 7, 2, 5, 4, 6, 1),
        booleanArrayOf(false, true, true, true, true, false, false)
    )//20403

    s.solution(
        intArrayOf(1, 2, 3),
        booleanArrayOf(true, true, true)
    )//102

    s.solution(
        intArrayOf(6, 1, 5, 2, 3, 4),
        booleanArrayOf(true, false, true, false, false, true)
    )//50200
}