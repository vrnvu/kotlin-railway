class EmailParser {
    companion object {
        fun parse(inputs: List<String>): Result<Email> =
            if (inputs.size == 3)
                Success(Email(to = inputs[0], subject = inputs[1], body = inputs[2]))
            else
                Failure("Unexpected end of input")
    }
}