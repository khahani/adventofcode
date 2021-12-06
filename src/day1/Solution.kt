package day1

import java.io.FileReader

class Solution {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }

    fun readInput() =
        FileReader("input.txt").use { reader ->
            reader.readLines()
        }
}