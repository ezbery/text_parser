package textParser.data

data class Examination(
    val type: ValueType,
    val data: String
) {
    constructor(input: Pair<String, String>) : this(
        type = input.first.toType(),
        data = input.second
    )

    enum class ValueType {
        TYPE1,
        TYPE2,
        OTHER
    }

    override fun toString(): String {
        return "$data;"
    }
}

fun String.toType(): Examination.ValueType {
    return when (this) {
        "type1" -> Examination.ValueType.TYPE1
        "type2" -> Examination.ValueType.TYPE2
        else -> Examination.ValueType.OTHER
    }
}