package b5

class Manager(override val name: String?= "",
              override val yearOfBirth: Int? = 0,
              override val degree: String? = "",
              daysWorking : Int? = 0,
              levelSalary : Double? = 0.0) : ParentProperties {
                private var namez = name
                private var yearOfBirthz = yearOfBirth
                private var degreez = degree
                private var daysWorkingz = daysWorking
                private var levelSalaryz = levelSalary
    override fun input() {
        TODO("Not yet implemented")
    }

    override fun operation() {
        TODO("Not yet implemented")
    }

    override fun calculateMoney(): Double? {
        TODO("Not yet implemented")
    }
}