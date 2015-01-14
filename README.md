# Quadratic-Equation
Project for specialization on UAM. Main goal of project is found better method of counting quadratic eqution

Algoritm:
1. User is providing x1 and x2
2. Program is counting b and c
3. Program is counting x1 and x2 using school method
4. Program is counting absolute error
5. Program is counting relative error
6. Program is counting x1 and x2 using better precision method
7. Program is counting absolute error
8. Program is counting relative error

Why so many if's?
Program is chacking which from provided variables is bigger. In case where user provided first variable bigger than second 
program was counting in wrong order. For example:
User provide x1 equal 23.2345 and x2 equal 12.2345
Program count x1 equal 12.2345 and x2 equal 23.2345
I don't know why it was this issue, but this if section fix this issue.
Other two if section is used to count the absolute value of the absolute error which is needed to count the relative error.

NOTE!!!
Please remember that this is only the student project which was writed by one night with using google search to found better 
precision method. If you have some idea how to do this problem better please write to me.
