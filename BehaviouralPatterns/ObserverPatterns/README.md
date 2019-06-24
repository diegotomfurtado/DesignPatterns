# Observer Patterns

### _“Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.” by Head First Design Patterns_

#### Use the Observer pattern in any of the following situations:
1. When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently.
2. When a change to one object requires changing others, and you don’t know how many objects need to be changed.
3. When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don’t want these objects tightly coupled.


#### Pros:
1. Supports the principle to strive for loosely coupled designs between objects that interact.
2. Allows you to send data to many other objects in a very efficient manner.
3. No modification is need to be done to the subject to add new observers.
4. You can add and remove observers at anytime. 

#### Cons:
1. If not used carefully the observer pattern can add unnecessary complexity
2. The order of Observer notifications is undependable

