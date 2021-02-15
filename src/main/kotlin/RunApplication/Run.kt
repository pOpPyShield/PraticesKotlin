package RunApplication

import RunAllApplication
import b4.Student
import b5.ContainThree
import b6.AllOfB6
import b6.B6
import b6.Customer
import b6.HandleCustomer
import java.util.*
fun String.capitalizeFirstLetter() = this.split(" ").joinToString(" ") {it.capitalize()}.trimEnd()
fun main() {
    //var runEx = AllOfB6()
    //runEx.operation()

    //var runOutside = B6()
    //runOutside.operation()

    //var runb5 = ContainThree()
    //runb5.operation()
    var runAllApp = RunAllApplication()
    runAllApp.run()

    //var runB4 = Student()
    //runB4.operation()
}