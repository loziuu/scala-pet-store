package pl.loziuu.infrastructure

import org.scalatest.FunSuite

class AggregateRootTest extends FunSuite {

  class FakeAggregateRoot() extends AggregateRoot

  test("Creating new aggregate root should generate UUID") {
    val root = new FakeAggregateRoot()

    assert(root.uuid != null)
  }

  test("Creating two aggregate roots should have different uuids") {
    val firstRoot = new FakeAggregateRoot()
    val secondRoot = new FakeAggregateRoot()

    assert(firstRoot.uuid != secondRoot.uuid)
  }
}
