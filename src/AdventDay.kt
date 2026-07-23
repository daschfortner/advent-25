import kotlin.io.path.Path
import kotlin.io.path.readText

abstract class AdventDay(val name: String) {
    val input: List<String> = Path("src/$name.txt").readText().trim().lines()

    abstract fun part1(): String

    abstract fun part2(): String
}