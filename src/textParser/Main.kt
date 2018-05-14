package textParser

import textParser.lib.Utils

class Main

fun main(args: Array<String>) {
    print("Test")
    Utils.saveFile("test.txt", "test")

    val results = Utils.readFile("sampleData.txt")
}
