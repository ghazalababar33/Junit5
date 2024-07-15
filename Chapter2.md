In the second chapter, we focus on creating our first basic tests using the @Test annotation. We will also see how to run the newly created tests and observe how the test names are displayed in the console when run in IntelliJ.

First, we create a package named junit5tests under src/test/java. Inside this package, we create a test class named FirstTestClass. We then create our first test method by annotating it with @Test from the org.junit.jupiter.api package. The method, named firstMethod, is defined with a void return type and prints a simple message to the console. We repeat this process to create a second test method named secondMethod.

To run these tests, we use the green icons in IntelliJ, choosing either to run individual test methods or the entire class. The test results, including the printed messages, are displayed in the Run panel.

Additionally, we learn about the @DisplayName annotation to provide more descriptive names for test methods in the console output. By adding @DisplayName to the secondMethod, we can see a more informative description instead of the method name when the test runs.
