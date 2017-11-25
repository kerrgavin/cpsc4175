# Homework 12
## Gavin Kerr

1. I appears that aspects and classes serve two different purposes. Classes define a subsection of self contained code that works toward a single goal. An aspect allows a programmer to insert code at certain intervals (pointcuts), allowing for less code to be written.

2. During the analysis phase, one is still mostly concerned with getting the correct specifications lined out. At this point, there is less concern about the platform and more about the operation of the software. During the design phase there is an emphasis on the platform because one is trying to transfer the specifications to design documentation. This documentation has to accomidate for platform requirements or features that could change the behavior of the software.

3. The UWP makes use of some core features that allow for wide spread and varied app deployment. For one, there is a single API that makes use of various SDKs that give functionality for specific platforms. In addition to that, there is a single App store that is accessed though every device.

4. Point-and-click IDE's, by their very nature, have to give the users a standard set of components they can select from in order to build their software. This is helpful because programmers can spend less time trying to re-invent the wheel and user interfaces can be constructed with relitive ease. The cost can arise because the programmer is using components they did not create in order to complete their product.

5. With each level of service, the consumer owns less and less of the acctual materials that are incorperated into the service. SaaS is the most restrictive, with the vendor owning most of the materials. Paas is next, with the consumer sharing certian parts with the vendor, such as the applications and services. Iaas is last with the consumer owning the application. 

6. 
	```xml
	<menu>
		<item>
			<name>Big Mac</name>
			<price>1.99</price>
		</item>
		<item>
			<name>Quarter Pounder</name>
			<price>0.99</price>
		</item>
		<item>
			<name>12 Piece Chicken</name>
			<price>4.00</price>
		</item>
		<item>
			<name>Double Quarter Pounder</name>
			<price>2.00</price>
		</item>
		<item>
			<name>Large Fries</name>
			<price>0.99</price>
		<item>
			<name>Chicken Sandwich</name>
			<price>2.99</price>
		</item>
		<item>
			<name>Salad</name>
			<price>1.00</price>
		</item>
		<item>
			<name>Large Drink</name>
			<price>1.00</price>
		</item>
		<item>
			<name>Grilled Chicken</name>
			<price>2.00</price>
		</item>
		<item>
			<name>Taco</name>
			<price>3.00</price>
		</item>
	</menu>
	
7. One technique we use is input validation. We make sure that the use has inputted the correct type of information before we process it. This partially to make it easier on the user, but it also prevents an individual to pass in something that would alter the functionality of the ATM.
For example, one could try and manipulate the memory by going past the confines of the memory and altering other segments.

8. I am currently taking by first database class now and it was interesting to see how the information from this paper relates. I had never really put much thought into the underlying functions of the databases we had been using. After reading a little bit, it became obvious to me how much of a concern the structure of the data base is. While my math skills arn't the best, I was able to follow Codd's disscussion on relations and their utilization. It seems that the paper follows the principle of de-coupling, allowing for programs to not have to worry about the design of the data on the machine.