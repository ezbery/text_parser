package textParser

import textParser.data.Examinations
import textParser.lib.Utils

class Main

fun main(args: Array<String>) {
    print("Test")
    Utils.saveFile("test.txt", "test")

    val results = Utils.readFile("sampleData.txt")
        .map { Utils.prepareString(it) }
    val file = Examinations(results)
}
