# Quarkus REST API Exercise

## Goal

The goal of this exercise is to learn how to use GitHub Copilot using an exercise that consists of building a REST API using [Quarkus](https://quarkus.io/).

## Exercises

We have created a Quarkus project with some files already created, you can find the project in the folder **exercisefiles/quarkus**. 

Let's start copiloting!!!

### 1. Create the code to handle a simple GET request

Move to the 'DemoResource.java' file and start writing the code to handle a simple GET request. In this first exercise, we have provided a comment that describes the code you need to generate. Just press enter and wait a couple of seconds, and Copilot will generate the code for you. If you are not happy with the code generated, you can press enter again, and Copilot will generate a new code

There is already a unit test implemented for this exercise, you can run it using the command `mvn test` before and after to validate that the code generated by Copilot is correct.

Then, create a new unit test for the case when no key is provided in the request.

After every exercise, feel free to package and run your application to test it.

Package: `mvn package`

Run: `mvn quarkus:dev`

Test: `curl -v http://localhost:8080/hello?key=world`

### 2. Dates comparison

New operation under /diffdates that calculates the difference between two dates. The operation should receive two dates as parameters in the format dd-MM-yyyy and return the difference in days. 

Additionally, create a unit test that validates the operation.

From now on, you will have to create unit tests for every new operation. Wasn't it easy with Copilot? 

### 3. Validate the format of a Spanish phone 

Validate the format of a Spanish phone number (+34 prefix, then 9 digits, starting with 6, 7 or 9). The operation should receive a phone number as parameter and return true if the format is correct, false otherwise. 

### 4. Validate the format of a Spanish DNI

Validate the format of a Spanish DNI (8 digits and 1 letter). The operation should receive a DNI as a parameter and return true if the format is correct, false otherwise. 

### 5. From color name to hexadecimal code

Based on existing colors.json file under resources, given the name of the color as path parameter, return the hexadecimal code. If the color is not found, return 404

Hint: Use TDD. Start by creating the unit test, and then implement the code.

### 6. Jokes creator

Create a new operation that calls the API https://api.chucknorris.io/jokes/random and returns the joke.

### 7. URL parsing

Given a URL as a query parameter, parse it and return the protocol, host, port, path and query parameters. The response should be in JSON format.

### 8. List of files and folders 

List files and folders under a given path. The path should be a query parameter. The response should be in JSON format.

### 9. Word counting

Given the path of a file, count the number of occurrences of a provided word. The path and the word should be query parameters. The response should be in JSON format.

### 10. Zipping

Create a zip file with the content of a given folder. The path of the folder should be a query parameter.

### 11. Containerize the application

Use the Dockerfile provided to create a Docker image of the application. In this case, the full content is provided, but in order to build, run and test the Docker image, you will use Copilot to generate the commands. 

I have created a DOCKER.md file where we will document the steps to build the application (native), build the container image, run the container and test the container.