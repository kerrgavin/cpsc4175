# Homework 6
## Gavin Kerr

1. 
	JAVA - I would use JAVA when a problem can be solved easier using an object oriented approch or when I need my code to be portable. Unlike Python, JAVA provides an extensive framework that gives it object oriented design a lot of power. Both languages have portable qualities but JAVA has had more time for integration.
	Python - Python I would use for scripting purposes and File I/O. Unlike Java, Python does not require a lot of extra code to compile, making it not strictly object oriented. This gives it powerful scripting functionality that makes it useful for a variety of scripting based problems. Additionally, Python provides a much easier method for managing File I/O.
2. 
	Example 1:
	x1 = 0;
	x2 = 3;
	x3 = 4;
	
	x4 = x1 + x2 + x3;
	print(x4);
	
	Example 2: 
	a = 0
	a = int(input())
	b = 0 
	b = int(input())
	c = a
	c = c + b
	print(c)
	
3. I looked at the coding standards for the NOAA National Weather Service NWS/OHD General Software Coding Standards and Guidelines and the Visual Basic Standards. Both read about the same in subroutine sizing and purpose but they diviate at naming. The first only specifies that subroutines should have verbs in their names while the latter is much more specific, noting the format of "verb.noun.adjective". I prefer the Visual Basic standard because it means that code that other people have written will be more like the code I have written, thus easier to understand. 

4. In my 1302 programming class I was making a text based, grid strategy game. As I was writing the game I realized at one point that I was writing similar code in multiple places. This code was about 15 lines long and was meant to get very specific data about input. When I realized this, I took the code I had written and figured out the small differences between them. Luckily, I could pass that difference in as an argument and was able to create a function that did the same thing. 

5. As per the book, a stub is an empty artifact that a filled artifact will call for testing purposes. A driver is an artifact that calls a filled artifact one or more times as to test it on its own. Last year when I took OOD, I had to use stubs and drivers for a lot of my game testing. When I was making the underlying graph data structure, I had to use stubs to test my vectors and drivers to test my edges. Further into my code, I had to user stubs to test my in game items and monsters. 

6. 	Strengths
		1. Supports fault isolation
		2. Major design flaws show up early
	Weaknesses
		1. Reusable code artifacts may not be adequately tested

7. 	Strengths
		1. Supports fault isolation
		2. Operational artifacts are tested thoroughly 
	Weaknesses
		1. Major design faults are detected late

8. The use of DSL comes from the fact that you have two sets of low and high level languages that need to be integrated. Thus, one could use top-down or bottom-up for either set then sandwich when the DSL is used. This won't happen everytime, but it appears that most of the time it would come down to that.

9. Testing carried out by the implementation group can cause problems if individuals are using different verions of the design documentation. The can cuase the testing to be preformed improperly. However, the SQA group has the most to loose if the testing is done wrong. Thus, the SQA group will do the most to ensure the testing is done correctly.

10. The topic of Dijkstra's letter can only be described as archaic. I'm sure, back when during the time this was written, the usefulness of the "GOTO" statement was hottly debated. However, the concept does bring up an interesting point about code utility. I myself have assumed that coding languages are developed for maximum untility, but now I wonder if that is entirely true. The "GOTO" statement appears to have lost most of its support in the mainstream while at one point having mainstream support. This makes me uneasy as it is possible that the coding standards I have come to use could at some point be seen in the same light. 