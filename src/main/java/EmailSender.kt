class EmailSender {
    companion object {
        fun send(email: Email): Result<Unit> {
            println("Sent to ${email.to}. Whoosh!")
            return Success(Unit)
        }
    }
}