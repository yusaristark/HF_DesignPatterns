package util

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(private val inputStream: InputStream) : FilterInputStream(inputStream) {
    override fun read(): Int {
        val char = inputStream.read()
        return if (char == -1) {
            char
        } else {
            Char(char).lowercase().toInt()
        }
    }
}