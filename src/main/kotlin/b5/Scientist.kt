package b5

class Scientist(override val name: String? = "",
                override val yearOfBirth: Int? = 0,
                override val degree: String? = "",
                thePaperPublic : Int? = 0,
                daysWorking : Int? = 0,
                levelSalary : Double? = 0.0) : ParentProperties {
                     private var namez = name
                     private var yearOfBirthz = yearOfBirth
                     private var degreez = degree
                     private var thePaperPublicz = thePaperPublic
                     private var daysWorkingz = daysWorking
                     private var levelSalaryz = levelSalary
    override fun input() {
        outLoop@while(true) {
            println("Scientist area")
            name@while(true) {
                println("Enter name: ")
                val name1 = readLine()?.capitalizeFirstLetter()
                if (name1.isNullOrEmpty()) {
                    println("Name can not be null or different format :D")
                    continue@name
                } else {
                    namez = name1
                    break@name
                }
            }
            yearOfBirth@while(true) {
                println("Enter year of birth(between 1 - 98): ")
                val yearOfBirth = readLine()?.toIntOrNull()
                if (yearOfBirth != null) {
                    if (yearOfBirth in 1..98) {
                        yearOfBirthz = yearOfBirth
                        break@yearOfBirth
                    } else {
                        println("It not in range, try again")
                        continue@yearOfBirth
                    }
                } else {
                    println("Wrong format, try again")
                    continue@yearOfBirth
                }
            }
            degree@while(true) {
                println("Enter degree of scientist: ")
                val degree = readLine()?.capitalizeFirstLetter()
                if(degree.isNullOrEmpty()) {
                    println("Degree can not be empty or different format")
                    continue@degree
                } else {
                    degreez = degree
                    break@degree
                }
            }
            thePaperPublic@while(true) {
                println("The paper public of scientist: ")
                val thePaperPublic = readLine()?.toIntOrNull()
                if(thePaperPublic != null) {
                    if(thePaperPublic > 0) {
                        thePaperPublicz = thePaperPublic
                        break@thePaperPublic
                    } else {
                        println("The paper public can not be small than 0, try again")
                        continue@thePaperPublic
                    }
                } else {
                    println("The paper public wrong format, try again")
                    continue@thePaperPublic
                }
            }
            daysWorking@while(true) {
                println("The day working of scientist: ")
                val daysWorking = readLine()?.toIntOrNull()
                if(daysWorking != null) {
                    if(daysWorking > 0) {
                        daysWorkingz = daysWorking
                        break@daysWorking
                    } else {
                        println("The days working can not small than 0")
                        continue@daysWorking
                    }
                } else {
                    println("The days working is wrong format, try again")
                    continue@daysWorking
                }
            }
            levelSalary@while(true) {
                println("The level salary of scientist: ")
                val levelSalary = readLine()?.toDoubleOrNull()
                if(levelSalary != null) {
                    if(levelSalary > 0.0) {
                        levelSalaryz = levelSalary
                        break@levelSalary
                    } else {
                        println("The level salary can not be small than 0, try again")
                        continue@levelSalary
                    }
                } else {
                    println("The level salary is in wrong format")
                    continue@levelSalary
                }
            }
        }
    }

    override fun operation() {
        input()
    }

    override fun calculateMoney(): Double? {
        var total : Double?
        total = this.daysWorkingz?.times(this.levelSalaryz!!)
        return total
    }
    fun String.capitalizeFirstLetter() = this.split(" ").joinToString(" ") {it.capitalize()}.trimEnd()
}