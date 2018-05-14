package textParser.lib

import java.io.File
import java.io.InputStream

object Utils {
    fun saveFile(fileName: String, data: String) {
        File(fileName).printWriter().use { it.println(data) }
    }

    fun appendFile(fileName: String, data: String) {
        File(fileName).printWriter().use { it.println(data) }
    }

    fun readFile(fileName: String): MutableList<String> {
        val inputStream: InputStream = File(fileName).inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().useLines {
            it.forEach {
                lineList.add(it)
            }
        }
        return lineList
    }

    fun prepareString(input: String): Pair<String, String> {
        val data = input.split(":")
        return Pair(data[0], data[1].dropLast(1))
    }
}