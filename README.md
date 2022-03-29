# Mock-test
Welcome to Java testing 

Testing with Mock Objects and EasyMocks.

We have some learning objectives, so upon completion of this course, learners will be able to use Mock Objects. 

Why to use Mock Objects?
 They're going to understand the different types of Mock Objects, understand how Mock Objects simulate collaborators behavior, create EasyMock tests to verify that collaborators with mocks did occur as expected and use EasyMock for Java testing. 

 What is mocking? 
Well, mocking provides the ability to test a class or method in isolation, so a class or method may be dependent on other classes or methods, a collaborator.
 A collaborator performs some functionality on behalf of the depending class or method. Mocking replaces the collaborators with mocks that simulate the normal environment of the class method. In other words, for example, let's say we had a class that needed a subclass in order to function properly, so let's say we had an abstract class. That subclass would be considered a collaborator as it's required for some of the functionality work. Well, we can mock a subclass and then test from there. 

Why use Mock Objects?
 A Java program often needs access to a resource during execution, resources include database, external systems, and the like. 
What if that resource is unavailable or it's inconvenient or impractical to always rely on it?
 You may simply want to write and test code without requiring a database. Instead of using the real object which represents the resource, we use a Mock Object. The Mock Object uses the same interface as the real object, clients cannot tell the difference between the Mock Object and the real object. The Mock Object uses fake data instead of real data, often just a subset of the data needed for testing. 
An example of this would be if we created students for a school system instead of loading that information into the student object from a database, we just use mock information. 

The types of Mock Objects. There are two general types of Mock Objects: 
Proxy-based mock objects. 
EasyMock 
jMock
and then we remap-based mock objects with jMockit and PowerMock. 
A proxy is an object which is used instead of the original object, a proxy object is used to imitate the real object for testing. 
A remap maps an object in respective of its own structure and is similar to defining a schema that can be defined and consumed. 
The class loader remaps the reference to the class file it will load. An example of reference in a class holder of an account class might be remapped as MyMock.class.


Mock Objects illustrated.
Client business object has a interface collaborator that attaches to the database. Well, we have a client business object that has an interface, but is connected to a Mock Objects that does not need to connect to an actual database but will pretend like it's connecting to a database. The business object sees only the interface type, the real collaborator and the Mock Object both implement it, but they implement it differently the real collaborator talks to the database the mock uses "fake" data.



Let's talk about working with Mock Objects. Testing mock objects generally requires four steps; create, set, invoke, and verify. A domain object and its mock objects are often connected by passing a Mock Object using constructor injection, not always possible as mock may be a remote object or service, and undesirable to add code to a domain object just for testing. We can do that to a mock object. Mock Object strategies. When constructor injection is not available, four objects are required; a target object, a collaborator object, Mock Object, and a specialization object.


Here's an EasyMock overview EasyMock is an open-source project for creating Mock Objects on the fly. Uses Java reflection to create Mock Objects for an interface and proxies are used for the actual implementation. EasyMock requires minimal code to produce a mock object from an interface, and EasyMock allows interface method names or reordering parameters to be changed without breaking the test code, which is available at http://easymock.org, and the package would be org.easymock. EasyMock features and benefits. EasyMock allows domain classes to be tested in isolation, generates mock objects dynamically, supports returned values and exception verification, and supports order checking and carnality of method calls.



An EasyMock object lifestyle would look like this. It would be imported so static utility method for EasyMock records the expected interactions with the mock. That's actually three, you see how this works now.



One, it's going to import stack utility methods for EasyMock, two, is going to create so it's then going to use EasyMock to create mock objects for the given interface or class It is then going to three, record the expected interactions with the mock. It is then four going to replay the mocks are put into replay mode or prepare the test mode. Five, they're going to execute the code under test, and then six, they're going to verify that the expected interactions took place.

