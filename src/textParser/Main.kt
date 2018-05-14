package textParser

import textParser.data.Examinations
import textParser.lib.Utils

class Main

fun main(args: Array<String>) {
    print("Test")

    val inputFile = Utils.readFile("sampleData.txt")
        .map { Utils.prepareString(it) }
    val outputFile = Examinations(inputFile)

    Utils.saveFile("test.txt", outputFile.toString())
}
