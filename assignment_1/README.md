# Assignment 1 - Getting Started 


### Java Development Kit (JDK)

Let's make sure we install the JDK, this will enable us to write Java code!

Please download and install OpenJDK from [this link](https://adoptopenjdk.net/?variant=openjdk15&jvmVariant=hotspot).


### Integrated Development Environments (IDE)

An **IDE** is a tool where you can write, test, and package your software.

For this course we suggest you use **IntelliJ Community Edition**!

Please download and install **IntelliJ** from [this link](https://www.jetbrains.com/idea/download/).

**Pro Tip** IntelliJ, can also install the JDK version of your choice for you. We
suggest that you at least once try to download and install the JDK yourself for practice.

### Git

**Git** is an extremely popular software version control tool that enable teams
of software developers to work on software functionality cooperatively. 

Please download and install **Git** from [this link](https://git-scm.com/downloads)

**GitHub** is an online repository where you can host the **source code** of your software
project. 

**Pro Tip**: there is a distinction between <u>source code</u> and what
folks may think of traditionally as a <u>"program.exe", the software executable</u>. 

We'll get more into how to package Java applications into a ".exe" later!


## Exercise 1

- Please use Git to **fork** this repository
- Please use Git to **clone** your **forked repository** onto your machine that you plan to work with
- With IntelliJ, please import this project as a **maven** project

We have a sample Java class: `assignment_1/src/main/java/HelloWorld.java`

```java
public class HelloWorld {
    final private static String statement = "";
    public static void main (String[] args)  {
        System.out.println(statement);
    }
}
```

The goal of this assignment is for you to:
 
- Assign the `variable` <u>statement</u> the value "Hello World" (if you are unsure please reference the screenshot below).
- Press the play button to run this code and successfully see "Hello World" printed!

![](./resources/assignment_1_play_hello_world.png?raw=false)


If you are able to complete this assignment you have
made your first steps into learning Java!


### Exercise 1 - Troubleshooting

- IntelliJ won't let me run this assignment
- Java hasn't installed
- I'm completely lost, please help!

**No worries** jump on **Slack** and I'll get you squared away!

### Exercise 1 - Activity Questions

- What is a `variable`?
- What is a `string`?
- What does `public static void main` mean?


 

