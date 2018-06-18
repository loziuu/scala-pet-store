## Pet store
Scala written application, strictly for learning purposes.
This system tries to compromise a Event Sourcing, CQRS, DDD, TDD,
reactive, functional and non-blocking I/O paradigms, without any frameworks.

### Modules
1. Customers
2. Pets
3. Sales

### Stack
1. Scala
2. SBT
3. Ratpack

#### Business rules

> 1. Anonymous user can't receive any order discounts

> 2. First order of every user has a 10% discount

> 3. User can ask for credit if he finalized 10 order successfully.

> 4. Order can't be shipped if order is not paid (if not cash on delivery)

> 5. User can't use "cash on delivery" option if his first order or is anonymous.
