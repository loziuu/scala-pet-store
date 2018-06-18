package pl.loziuu.pet

import org.scalatest.FunSuite

class PetTest extends FunSuite {

  test("Create pet with name should set name and uuid") {
    val name = "Stiffy"

    val pet = Pet(name)

    assert(pet.uuid != null)
    assert(pet.name === name)
  }
}
