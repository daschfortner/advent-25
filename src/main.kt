fun runDay(day: AdventDay) {
    println("=========== ${day.name} ===========")
    println(" [part 1]")
    println("   > ${day.part1()}")
    println(" [done]")
    println(" [part 2]")
    println("   > ${day.part2()}")
    println(" [done]")
    println("=========== ${day.name} ===========")
}

fun main() {
    val days = listOf(
        Day1(),
        Day2(),
        Day3(),
    )

    days.forEach{runDay(it)}
}