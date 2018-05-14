package textParser.lib

import java.io.File

object Utils {
    fun saveFile(fileName: String, data: String) {
        File(fileName).printWriter().use { it.println(data) }
    }

    fun appendFile(fileName: String, data: String) {
        File(fileName).printWriter().use { it.println(data) }
    }
}