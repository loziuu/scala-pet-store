package pl.loziuu.sales


import org.scalatest.FlatSpec
import org.scalatest.Matchers._
import pl.loziuu.pet.Pet

class OrderTest extends FlatSpec {

  "A order with empty basket" should "return empty products list with no cost and uuid" in {
    val order = new Order

    order shouldNot be
    order.products should have size 0
    order.cost shouldBe 0
  }

  "A order with one product" should "return product list and new cost" in {
    val petCost = 150.0
    val stiffy = Pet("Stiffy")
    val order = new Order

    order.add(Product(stiffy, petCost))

    order.products should have size 1
    order.cost shouldBe petCost
  }
}
