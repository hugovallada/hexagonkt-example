@JvmRecord
data class User(val name: String, val age: Int) {

    class Builder {
        private var name: String = ""
        private var age: Int = 0

        fun name(name: String): Builder {
            this.name = name
            return this
        }

        fun age(age: Int): Builder {
            this.age = age
            return this
        }

        fun build(): User {
            return User(name, age)
        }
    }

    companion object {
        fun builder(): Builder {
            return Builder()
        }
    }
}
