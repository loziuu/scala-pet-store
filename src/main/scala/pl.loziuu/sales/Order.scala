package pl.loziuu.sales

import pl.loziuu.infrastructure.AggregateRoot

import scala.collection.mutable.ArrayBuffer

class Order() extends AggregateRoot {

  private val _products: ArrayBuffer[Product] = new ArrayBuffer[Product]()

  def cost: Double = _products.map(_.cost).sum

  def products: List[Product] = _products.toList

  def add(product: Product): Unit = _products.+=(product)
}
