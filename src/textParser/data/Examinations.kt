package textParser.data

data class Examinations(
    val name: String = "name",
    val examinations: List<Examination>
) {
    constructor(input: List<Pair<String, String>>) : this(
        examinations = input
            .map {
                Examination(it)
            }
            .sortedBy { it.type }
    )

    override fun toString(): String {
        var output = ""
        val list = this.examinations.map { it.toString() }
        list.forEach { output = "$output$it\n" }
        return output
    }
}