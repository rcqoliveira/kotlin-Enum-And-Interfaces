package core

import `interface`.PaymentMethods

class PayTicket : PaymentMethods {
    override fun pay() {
        println("ticket payment!")
    }
}