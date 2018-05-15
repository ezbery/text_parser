package textParser

import textParser.data.Examinations
import textParser.lib.Utils

class Main

fun main(args: Array<String>) {
    print("Test")

    val data = Examinations(
        Utils.readFile("sampleData.txt")
            .map { Utils.prepareData(it) }
    )
    Utils.saveFile("test.txt", data.toString())
}
