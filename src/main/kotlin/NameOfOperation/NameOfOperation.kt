package NameOfOperation

open class NameOfOperation(nameOfOperation : String) {
    protected var nameOfOperationInside = nameOfOperation
        get() = field
        set(value)  {
            field = value
        }

}