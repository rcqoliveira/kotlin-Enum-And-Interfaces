package core

import `interface`.PaymentMethods

class PayInCash : PaymentMethods {
    override fun pay() {
        println("in cash payment!")
    }
}