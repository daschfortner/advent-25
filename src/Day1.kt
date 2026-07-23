class Day1 : AdventDay("Day1") {
    override fun part1(): String {
        // NOTE: this function is nexted in here even though it's a little gross
        // simply because I solved this problem before I developed the AdventDay
        // abstraction and I was a bit too lazy to re-architect a cleaner way of
        // solving this so I literally copy-pasted it all into this function.
        fun getNextDial(currentDial: Int, dialAmount: Int): Int {
            if (dialAmount > 0) {
                return (currentDial + dialAmount) % 100
            }

            val ticks = dialAmount % 100
            val dialedAmount = currentDial + ticks

            return when {
                dialedAmount < 0 -> dialedAmount + 100
                else -> dialedAmount
            }
        }

        var dial: Int = 50
        var timesAtZero: Int = 0

        for (line in input) {
            val direction = when {
                line.startsWith("R") -> 1
                else -> -1
            }

            val amount = line.drop(1).toInt() * direction

            dial = getNextDial(dial, amount)

            if (dial == 0) {
                timesAtZero++
            }
        }

        return "$timesAtZero"
    }

    override fun part2(): String {
        return "!!! WARN: not implemented"
    }
}
