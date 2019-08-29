class InputReader {
    companion object {
        fun read(): List<String> = readLines(listOf("To", "Subject", "Body"))
        private fun readLines(prompts: List<String>): List<String> =
            prompts.map {
                print("${it}: ")
                readLine() ?: ""
            }
    }
}