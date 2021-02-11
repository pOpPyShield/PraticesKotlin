package RunApplication

import b6.AllOfB6
import b6.Customer
import b6.HandleCustomer
import java.util.*
fun String.capitalizeFirstLetter() = this.split(" ").joinToString(" ") {it.capitalize()}.trimEnd()
fun main() {
    var runEx = AllOfB6()
    runEx.operation()

}