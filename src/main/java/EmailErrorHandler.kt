class EmailErrorHandler {
    companion object {
        fun error(message: String) =
            println("Something went wrong: $message")
    }
}