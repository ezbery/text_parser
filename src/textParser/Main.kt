package textParser

import textParser.data.Examinations
import textParser.lib.Utils

class Main

fun main(args: Array<String>) {
    val dataFormat = Regex("""^(\S+)\:\s?(\S+)\;""")
    print("Test")

    val data = Examinations(
        Utils.readFile("sampleData.txt")
            .mapNotNull { Utils.getData(it, dataFormat) }
            .map { Utils.prepareData(it) }
    )
    Utils.saveFile("test.txt", data.toString())
}
