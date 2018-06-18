package pl.loziuu.customer

import pl.loziuu.infrastructure.AggregateRoot

case class Customer(details: PersonalDetails) extends AggregateRoot {

  val firstName: String = details.firstName

  val lastName: String = details.lastName

  val email: String = details.email
}
