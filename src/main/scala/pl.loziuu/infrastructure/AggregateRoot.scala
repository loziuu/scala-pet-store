package pl.loziuu.infrastructure

import java.util.UUID

abstract class AggregateRoot {
  val uuid: UUID = UUID.randomUUID()
}
