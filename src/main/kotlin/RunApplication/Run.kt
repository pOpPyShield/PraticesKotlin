package RunApplication

import b6.Customer
import b6.HandleCustomer
import java.util.*
fun String.capitalizeFirstLetter() = this.split(" ").joinToString(" ") {it.capitalize()}.trimEnd()
fun main() {

    var inpProgram : Int?
    var cuszz = Customer()
    var arrCustomer = HandleCustomer()
    outLoop@while(true) {

        println("======Welcome to b6=====")
        println("==1. Enter information for customer")
        println("==2. See information of customer")
        println("==3. Arrange customer of money service")
        println("==4. Find customer")
        println("==5. Exit")
        println("=> Enter number: ")
        inpProgram = readLine()?.toIntOrNull()
        if(inpProgram == null || inpProgram <=0 || inpProgram > 5) {
            println("Oops, some problem happened")
            continue@outLoop
        } else {
            if(inpProgram == 1) {
                fun1@while(true) {
                    println("Enter number of customer you want to add: ")
                    var inpCustomer : Int? = readLine()?.toIntOrNull()
                    if(inpCustomer == null || inpCustomer <= 0) {
                        println("Oops, wrong format, try again")
                        continue@fun1
                    } else {
                        for(i in 0 until inpCustomer) {
                            println("Enter ${i+1} customer")
                            cuszz.operation()
                            arrCustomer.addCustomer(cuszz)
                        }
                        println("Add success!!")
                        continue@outLoop
                    }
                }
            } else if(inpProgram == 2) {
                fun2@while(true) {
                    if(arrCustomer.informationOfCustomerArr() == 0) {
                        println("Do you want to add more service into it?y(yes) or n(no)")
                        val continueFun2 = readLine()?.toUpperCase()?.trim()
                        if(continueFun2 == null || continueFun2 == "N" || continueFun2 == "NO") {
                            break@fun2
                        } else {
                            continue@outLoop
                        }
                    } else {
                        continue@outLoop
                    }


                }

            } else if(inpProgram == 3) {
                fun3@while(true) {
                    if(arrCustomer.sortedArrCustomer() == 0) {
                        println("Can not sorted customer because dont have any service here?y(yes) or n(no)")
                        val continueFun2 = readLine()?.toUpperCase()?.trim()
                        if(continueFun2 == null || continueFun2 == "N" || continueFun2 == "NO") {
                            break@fun3
                        } else {
                            continue@outLoop
                        }
                    } else {
                        continue@outLoop
                    }
                }
            } else if(inpProgram == 4) {
                fun4@while(true) {
                    println("Enter name to find: ")
                    val nameCustomerr = readLine()?.capitalizeFirstLetter()
                    if(nameCustomerr == null) {
                        println("Wrong format, try again")
                        continue@fun4
                    } else {
                        if(arrCustomer.findCustomerByName(nameCustomerr)) {
                            println("Success")
                            continue@outLoop
                        } else {
                            println("Can't find it")
                            println("Do you want to continue?y(yes) or n(no)")
                            val continueFun2 = readLine()?.toUpperCase()?.trim()
                            if(continueFun2 == null || continueFun2 == "N" || continueFun2 == "NO") {
                                break@fun4
                            } else {
                                continue@fun4
                            }
                        }
                    }
                }
            } else if(inpProgram == 5){
                println("Thanks for using my program ^^ :D ")
                break@outLoop
            }
        }
    }
}