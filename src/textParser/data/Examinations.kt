package textParser.data

data class Examinations(
    val name: String = "name",
    val examinations: List<Examination>
) {
    constructor(input: List<Pair<String, String>>) : this(
        examinations = input.map { Examination(it) }
    )
}