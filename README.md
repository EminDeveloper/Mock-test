# Mock-test
Welcome to Java testing 

Testing with Mock Objects and EasyMocks.

We have some learning objectives.

## Why to use Mock Objects?
 They're going to understand the different types of Mock Objects, understand how Mock Objects simulate collaborators behavior, create EasyMock tests to verify that collaborators with mocks did occur as expected and use EasyMock for Java testing. 

## What is mocking? 
<ul>
 <li>Mocking provides the ability to test a class or method in isolation, so a class or method may be dependent on other classes or methods, a collaborator.</li>
</ul>
 A collaborator performs some functionality on behalf of the depending class or method. Mocking replaces the collaborators with mocks that simulate the normal environment of the class method. In other words, for example, let's say we had a class that needed a subclass in order to function properly, so let's say we had an abstract class. That subclass would be considered a collaborator as it's required for some of the functionality work. Well, we can mock a subclass and then test from there. 
<img src="https://user-images.githubusercontent.com/26926048/160755718-95693607-d2af-48b8-b51f-2cfd21118264.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

## Why use Mock Objects?
 A Java program often needs access to a resource during execution, resources include database, external systems, and the like. 
What if that resource is unavailable or it's inconvenient or impractical to always rely on it?
 You may simply want to write and test code without requiring a database. Instead of using the real object which represents the resource, we use a Mock Object. The Mock Object uses the same interface as the real object, clients cannot tell the difference between the Mock Object and the real object. The Mock Object uses fake data instead of real data, often just a subset of the data needed for testing. 
An example of this would be if we created students for a school system instead of loading that information into the student object from a database, we just use mock information. 

The types of Mock Objects. There are two general types of Mock Objects: 
<ul><li>Proxy-based mock objects.</li>
<ul><li>EasyMock </li>
<li>jMock</li></ul></ul>
and then we remap-based mock objects with jMockit and PowerMock. 
A proxy is an object which is used instead of the original object, a proxy object is used to imitate the real object for testing. 
A remap maps an object in respective of its own structure and is similar to defining a schema that can be defined and consumed. 
The class loader remaps the reference to the class file it will load. An example of reference in a class holder of an account class might be remapped as MyMock.class.
<img src="https://user-images.githubusercontent.com/26926048/160756099-2538f9f7-48cc-4593-83a0-784482f38df8.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/160756196-8152d661-7d9f-47c3-ae1f-fb5820cbca73.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">


## Mock Objects illustrated.
Client business object has a interface collaborator that attaches to the database. Well, we have a client business object that has an interface, but is connected to a Mock Objects that does not need to connect to an actual database but will pretend like it's connecting to a database. The business object sees only the interface type, the real collaborator and the Mock Object both implement it, but they implement it differently the real collaborator talks to the database the mock uses "fake" data.
<img src="https://user-images.githubusercontent.com/26926048/160756293-011509d8-7bfd-4fae-a458-26e37b4b213f.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">



## Mock Objects. 
Testing mock objects generally requires four steps; create, set, invoke, and verify. A domain object and its mock objects are often connected by passing a Mock Object using constructor injection, not always possible as mock may be a remote object or service, and undesirable to add code to a domain object just for testing. We can do that to a mock object. Mock Object strategies. When constructor injection is not available, four objects are required; a target object, a collaborator object, Mock Object, and a specialization object.
<img src="https://user-images.githubusercontent.com/26926048/160756386-bcc4c3dc-c6ec-4c15-aef0-860627287c2a.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">



## EasyMock
Overview EasyMock is an open-source project for creating Mock Objects on the fly. Uses Java reflection to create Mock Objects for an interface and proxies are used for the actual implementation. EasyMock requires minimal code to produce a mock object from an interface, and EasyMock allows interface method names or reordering parameters to be changed without breaking the test code, which is available at http://easymock.org, and the package would be org.easymock. EasyMock features and benefits. EasyMock allows domain classes to be tested in isolation, generates mock objects dynamically, supports returned values and exception verification, and supports order checking and carnality of method calls.
<img src="https://user-images.githubusercontent.com/26926048/160756465-6a959fc8-e215-446d-a43a-bc16581f0d5c.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">



An EasyMock object lifestyle would look like this. It would be imported so static utility method for EasyMock records the expected interactions with the mock. That's actually three, you see how this works now.
<img src="https://user-images.githubusercontent.com/26926048/160756525-d9ae4b7c-6415-437e-9a20-fb51aed89533.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">



One, it's going to import stack utility methods for EasyMock, two, is going to create so it's then going to use EasyMock to create mock objects for the given interface or class It is then going to three, record the expected interactions with the mock. It is then four going to replay the mocks are put into replay mode or prepare the test mode. Five, they're going to execute the code under test, and then six, they're going to verify that the expected interactions took place.
<img src="https://user-images.githubusercontent.com/26926048/160756861-7e5bf309-172c-4b90-98c6-cc2db7f5a577.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/160756927-a4e7d3d3-b95b-41e5-a2a6-65ed4c5b7f4e.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/161114981-954f6bcd-381b-4959-a580-c149c8c2e1d4.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/161116223-26c96116-4268-4a6f-82b1-a6b2ab1956fe.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/161116532-ade6d4d5-d4eb-43fe-a720-179b9ff82a59.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/161116539-b73da73b-9383-4b96-b412-c8ee0ddb9218.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/161116542-f2641187-e5d8-4a54-b938-b21652063181.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">


<img src="https://user-images.githubusercontent.com/26926048/161374639-308caa68-7662-472f-b9c7-22c8138ef756.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/161382217-248e2631-7a1d-480f-8a53-6a72b26220e7.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">


<img src="https://user-images.githubusercontent.com/26926048/161382510-181647a8-85cf-4e45-8e4d-2a93af76253c.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">


<img src="https://user-images.githubusercontent.com/26926048/161382514-f33d4703-9496-4bf4-b862-8f12e4c91731.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/161383267-26f35e8f-1f01-43c8-934a-6ebf8434bd58.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/161383269-fec9b12f-38db-4edd-a358-b99ad24c7454.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/161383270-524f260f-63f4-4071-8011-5fbda5fdd014.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/161383271-02807986-2ed8-49ce-8ce0-41d0ed66bdfe.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

<img src="https://user-images.githubusercontent.com/26926048/161383273-48780106-ac43-489f-b2bc-ebff6e450f0f.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">


Reading Resources
EasyMock
https://easymock.org/user-guide.html

Mockito Vs EasyMock
https://www.javatpoint.com/mockito-vs-easymock


---------------------------------------------------------------------------------------------------------------------------

##  Mock Object Controller

<img src="https://user-images.githubusercontent.com/26926048/161419250-3bd9c55c-2650-4ac7-b4ed-93b0a1bf9f20.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/161419251-24b2adbf-cc56-4c8c-a80a-2f20f948c5d6.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/161419252-4447a4a3-90cd-4b03-b21a-d3d86ade8452.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/161419253-d78ecfac-3ab2-4b5d-86b4-cf3932c9dfc6.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/161419254-d5c6864a-5176-42ec-9da8-fd4ca38ece1c.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">
<img src="https://user-images.githubusercontent.com/26926048/161419255-8ca2378a-2efb-45f2-b699-652b06fb373b.PNG" alt="body" style="max-width: 1920px; max-height: 1195px;">

#### Resourse  Types of Mocks:

https://www.journaldev.com/22234/easymock-nice-strict-mock#:~:text=EasyMock%20mock%20objects%20can%20have,%E2%80%93%20default%2C%20strict%20and%20nice.
