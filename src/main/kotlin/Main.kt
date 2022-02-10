import Utility.Print
import enum.PaymentTypes

fun main(args: Array<String>) {
    val paymentTypes = PaymentTypes.Ticket;

    Print().line()
    paymentTypes.pay();
    Print().line()
    println("value: ${paymentTypes.ordinal}, name: ${paymentTypes.name}" )
    Print().line()
    println("value: ${paymentTypes.ordinal}, name: ${paymentTypes.name}, description: ${paymentTypes.description}" )
    Print().line()

}