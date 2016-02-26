###The Giftbit HelloWorld repository overview

In the actual exercise you will be coding in Groovy and/or Java.  In order to avoid any panic and time spent on environment problems during the exercise, we are providing you this 'HelloWorld' git repository that has the same format and environment requirements as the actual coding exercise, and will allow you to verify that you are set up correctly.

###Testing your environment

Once you have cloned/downloaded this repository, please ensure you can successfully run the following commands on your development machine at the root of the project, as these are how we will test your submission.  Note that you will need Java JDK 1.7 or higher installed, but everything else should be automatically downloaded for you by Gradle when you first run the commands.

> ./gradlew run

> ./gradlew test 

Or for Windows

> gradlew.bat run

> gradlew.bat test

The output of 'run' or 'test' should be a 'BUILD SUCCESSFUL' message.

While we will test your submission from the command line as mentioned, you are welcome and encouraged to use your favourite IDE while developing.   Note that you will need a working internet connection to complete the exercise.

###Working on and submitting your exercise

Source files exist at 
> /src/main/groovy/[package]/[files]

and tests at 
> /src/test/groovy/[package]/[files]

Note that java and groovy source can exist side by side and interoperate as is shown in this example.  There is no bias in evaluation for using Groovy versus Java.

At the beginning of your time slot, we will provide you with read access and a link to the actual exercise Github repository (we'll need your Github username) that will have identical structure to this one, but additional skeleton classes and a README that will define the problem. You will fork it into your own Github account and do your work as you would normally.  At or before the end of your 3 hour time slot, you'll send us the link to your repository and add read access collaborator privedges to 'pdlocke' Github account.  We will take a look at your commits as well as the final state of the repository.

###Gradle and external dependencies
Understanding or working with Gradle in any depth is not necessary to complete the exercise.  We use it to minimize any potential environment issues and simplify/standardize the way the exercise and tests are built and run.   That said, you may find yourself wanting to add external dependencies during the exercise and you are welcome to, as we have done with 'http-builder' in this example in order to connect to a REST API.   A single line in build.gradle allows you to import any third party library from maven central.

>     compile 'org.codehaus.groovy.modules.http-builder:http-builder:0.7.1'

###How your result will be evaluated
In the exercise, you will write Groovy and/or Java OO code to solve a set problem given to you at the start of your time slot.  You should approach the exercise as if you were writing production-bound code. There is no bias in evaluation for using Groovy language features versus plain Java in your code.   **We will evaluate your submission based on the following criteria, in this order**:
 - Code structure and overall approach to the problem.
 - Correctness of results
 - Approach to testing
 - Performance considerations and how your solution would scale

###Preparation checklist
 - Your Github username sent to interviewsupport@giftbit.com
 - Java 1.7+ installed
 - Sample repository downloaded, and successfully run the Gradle run and test commands listed
