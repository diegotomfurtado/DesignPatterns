# Strategy Patterns

### "Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable." by _Head First Design Patterns_

#### Pros:
1. Prevents the conditional statements. (switch, if, else…)
2. The algorithms are loosely coupled with the context entity. They can be changed/replaced without changing the context entity.
3. Can swap algorithms used inside an object at runtime.
4. Can isolate the implementation details of an algorithm from the code that uses it.
5. Very easy extendable.
6. Open/Closed Principle. You can introduce new strategies without having to change the context.
7. Can replace inheritance with composition.

#### Cons:
1. Clients must know existence of different strategies and a client must understand how the Strategies differ
2. It increases the number of objects in the application.
3. If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.

