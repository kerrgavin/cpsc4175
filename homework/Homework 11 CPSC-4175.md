# Homework 11
## Gavin Kerr

1. I would say that you shouldn't sweat the small stuff until you get the most important parts out of the way

2. Stepwise refinement isn't very effective when it comes to large projects, while OOAD allows for smaller sized code in large projects. Stepwise can also result in loss of design information. Additionally, the two take different perspectives when it comes to breaking the design process up. Where stepwise assigns importance to individual aspects, OOAD necessitates that data types are contructed before procedures and functions.

3. I found this paper to be very interesting due to a coding competition I participated in recently. Specifically, the "8 Queens" example was very similar to many of the problems we encountered that had a time limit to run. When ever we encounted such a problem, we had to resort to a similar method in an attempt to get the right timing. However, this brings in the apparent problem, at least for the setting I was in, about how long this process takes. For our situation, there was need to same the most time, and the stepwise process would not have been optimal.

4. A good example of due dilligence would be a company transfering some of their phone based help services to automation. That way, less employees would be needed to assist customers with standard activties and more customers could be serviced at once for less.

5. The problem is that the two objects are linked in a way that makes it difficult to determine where an error originates if one occurs. One solution is to use Data Encapsulation in order to advance seperation of concerns.

6. The documentation I generated from code generated from Umbrello in located in a different folder in this same directory

7. The example found is as follows:
	```
	all:
    g++ main.cpp hello.cpp factorial.cpp -o hello
	```
	The first line labels all of the target dependencies. The second line is the system command that will be run. This line is targeting all dependencies and the second line compiles the files.