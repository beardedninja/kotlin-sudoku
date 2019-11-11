import generation.Generator

fun main() {
    val puzzle = Generator(9, 0)
    puzzle.build()
    puzzle.print()
}