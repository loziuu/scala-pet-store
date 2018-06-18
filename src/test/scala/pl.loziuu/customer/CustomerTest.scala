package pl.loziuu.customer

import org.scalatest.FunSuite

class CustomerTest extends FunSuite {

  test("Create customer with personal details") {
    val details = PersonalDetails("John", "Doe", "john.doe@example.org")

    val customer = Customer(details)

    assert(customer.firstName === details.firstName)
    assert(customer.lastName === details.lastName)
    assert(customer.email === details.email)
  }
}
