# Singleton Patterns

### _“Is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.” by Dive Into Design Patterns._

#### Use the Singleton pattern in any of the following situations:
1. A Singleton can be used instead of a single instance of a class because a logging class usually needs to be used over and over again ad nauseam by every class in a project. If every class uses this logging class, dependency injection becomes cumbersome.
2. To solve two problems at the same time, violating the Single Responsibility.

#### To ensure that Singleton principles are being used, we must to follow:
1. Ensure that a class has just a single instance;
2. Provide a global access point to that instance

#### Pros:
1. You can be sure that a class has only a single instance.
2. You gain a global access point to that instance.
3. The singleton object is initialized only when it’s requested for the first time

#### Cons:
1. The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
2. It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. 

#### Interesting things:
1. java.lang.Runtime and java.awt.Desktop are 2 singleton classes provided by JVM;
2. 
