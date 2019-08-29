class EmailValidator {
    companion object {
        fun validate(email: Email) = validAddress(email) then ::notBlank

        private fun validAddress(email: Email): Result<Email> =
            if (email.to.contains("@"))
                Success(email)
            else
                Failure("Invalid email address")

        private fun notBlank(email: Email): Result<Email> =
            if (email.subject != "" && email.body != "")
                Success(email)
            else
                Failure("Subject and body must not be blank")

    }
}