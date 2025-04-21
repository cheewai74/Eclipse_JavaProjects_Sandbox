
Concepts:</BR>
1. The Observer Pattern defines a one-to-many dependency between objects so that when one
object changes state, all of its dependents are notified and updated automatically.</BR>
2. It specifies communication between objects: observable and observers.</BR>
3. An observable is an object which notifies observers about the changes in its state.</BR>
4. Observable object needs to keep references to the observers</BR>
5. All potential observers need to implement the Observer interface. 
   This interface has just one method, update(), that is called when the
   Subject’s state changes.</BR>

Concept Relate:</BR>
Subject(Publisher) + Observers(Subscribers) = Observer Pattern