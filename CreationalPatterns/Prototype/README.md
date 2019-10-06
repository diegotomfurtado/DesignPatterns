# Singleton Patterns

### _“Is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.” by Dive Into Design Patterns._

#### Here’s how it works: 
1. Create a set of objects, configured in various ways. When you need an object like the one you’ve configured, you just clone a prototype instead of constructing a new object from scratch.

#### When should use it:
1. The Client can produce a copy of any object that follows the prototype interface.
2. Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects.

#### Steps:
1. The Prototype interface declares the cloning methods. In most cases, it’s a single clone method;
2. The Concrete Prototype class implements the cloning method. In addition to copying the original object’s data to the clone, this method may also handle some edge cases of the cloning process related to cloning linked objects, untangling recursive dependencies, etc.
3. The Client can produce a copy of any object that follows the prototype interface.

#### Pros:
1. We can clone objects without coupling to their concrete classes.
2. We can get rid of repeated initialization code in favor of cloning pre-built prototypes.
3. We can produce complex objects more conveniently.
4. We get an alternative to inheritance when dealing with configuration presets for complex objects.

#### Cons:
1. Cloning complex objects that have circular references might be very tricky.
