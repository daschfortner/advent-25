class Day3 : AdventDay("Day3") {
    override fun part1(): String {
        var sum = 0
        input.forEach { bank ->
            var highest = 0

            for (i in 0..<bank.length) {
                for (j in i..<bank.length) {
                    if (i != j) {
                        val voltage = "${bank[i]}${bank[j]}".toInt()

                        if (voltage > highest) {
                            highest = voltage
                        }
                    }
                }
            }

            sum += highest
        }
        return "$sum"
    }

    override fun part2(): String {
        return "!!! WARN not implemented"
    }
}