import java.math.BigInteger

class Day2 : AdventDay("Day2") {
    override fun part1(): String {
        // for this puzzle all input is on a single line
        val line = input[0]
        val ranges = line.split(",")
        var sum = 0L

        for (range in ranges) {
            val (startStr, endStr) = range.split("-")
            val start = startStr.toLong()
            val end = endStr.toLong()

            for (id in start..end) {
                val idString = id.toString()

                if (idString.length % 2 == 0) {
                    val firstHalf = idString.take(idString.length / 2)
                    val secondHalf = idString.takeLast(idString.length / 2)

                    if (firstHalf == secondHalf) {
                        sum += id
                    }
                }
            }
        }

        return "$sum"
    }

    override fun part2(): String {
        return "!!! WARN not implemented"
    }
}