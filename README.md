cucumber-example
================

Sample project for using cucumber with Scala

Run all scenarios with the command: sbt test

	src/main/scala/com/edpond/cucumberexample/Calculator.scala

This is the Scala source of the calculator that we want to test.

	src/test/resources/com/edpond/cucumberexample/systemtest/calculator/add.feature

This Gherkin description contains two scenarios for testing the add feature of the calculator.

	src/test/scala/com/edpond/cucumberexample/systemtest/calculator/CalculatorSteps.scala

This Scala source contains step definitions used to test calculator features.


Cucumber usage documentation can be found here:
https://github.com/cucumber/cucumber/wiki

But it appears to be in the process of being rewritten here:
http://cukes.info/

Add the following to enable the cucumber plugin:

    resolvers += "Templemore Repository" at "http://templemore.co.uk/repo"

    addSbtPlugin("templemore" % "sbt-cucumber-plugin" % "0.7.2")
