# Homework 5
## Gavin Kerr

1. Operation-oriented design is the design technique in which the emphasis is on the operations. Data-oriented design is when the data is consider first. They differ in the fact they put the emphasis on one part of the whole picture, while leaving the other to some secondary position. This is to the determent of the secondary.
2. The inputs to the design workflow are the specification documents. The point of the design workflow is to iterate and increment until the input are in a fomat that can be used by the programmers. As such, the inputs directly affect the output, which is what the programmers work off of. The outputs are the design documents. These are the documents that will be used by the programmers and will directly affect how they build the software.

3. For the input variables I would perhaps take the majors and minor a paticular student. The output variables would be the classes that the student would have to take to graduate. The processing variable would hold the intermidiate values from transforming the majors and minors to the classes.

4. The subprocedures would be as follows: identify majors/minors, retrieve class list, return class list.

5. One of the classes can be described as follows:
	Class: Major
	Attributes: Names, class list
	Behaviors: getClassList, setClassList, retrieveClassList

6. I really don't see these view as opposing or conflicting. I believe the fact that they are both interavtie is equally true for our project. If I were to give a graphical representation of what I mean, it would look like the standard spiral that we discussed in class when referring to our phases. But instead of a smooth curve that goes from design to implementation, it would be a spiral itself that follow the path of the curve. Because the design greatly impacts the implementation, this method provides the best way of quality control through constant refinement. 

7. When testing an implementation, one is trying to figure out if the software does what it is suppose to without fault. When testing a design, one is verifying that the specifications have been accurately and completely incorporated into the design. The first step of the procedure would be to logically analyze the specification documentation and the design documentation. Once that is complete, then the inputs and logical conclusions would need to be compared for identical traits. In the case of the graduation requirments, both would have to result in the class listings for the given input of the majors/minors. For the object oriented design, one would have to compare the specification documentation to the design documentation. In doing this, one would have to draw clear and definable lines from the specification to the classes and the properties of the classes in the design documentation. 

8. The cyclomatic complexity is 2. This is because there are two branches in the code.

9. I downloaded argouml and played with it for a little while. It seems to have some pretty good UML abilitys that cover most of what we go over in class and the UI is friendly. I also saw that there was a generate code feature which is quite powerful. I will definitly make use of this in my project. 

10. I think my favorite part of the article is when it's stated that "there's no science." I audibly laughed at this due to how true it is. I also find the comparison to a "pre-sumerian civilization" to be quite interesting. In my mind, I can not invision a way to advance software to an equivalent "post-industrial civilization." Additionally, I am dumbfounded by stating that because it puts into perspective the distance we have to travel. And to conclude with this motif of suprise, I find it hard to believe how many errors are allowed to be left in comercially available code.  