fun main() {
    read() to
            (EmailParser)::parse then
            (EmailValidator)::validate then
            ((EmailSender)::send) otherwise
            ((EmailErrorHandler)::error)
}

private fun read(): List<String> = readLines(listOf("To", "Subject", "Body"))
private fun readLines(prompts: List<String>): List<String> =
    prompts.map {
        print("${it}: ")
        readLine() ?: ""
    }