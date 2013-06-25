package com.edpond.cucumberexample.systemtest.calculator

import org.junit.Test
import org.junit.runner.RunWith
import cucumber.api.junit.Cucumber
import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest.matchers.ShouldMatchers
import com.edpond.cucumberexample.Calculator
import junit.framework.Assert._

@Test
@RunWith(classOf[Cucumber])
@Cucumber.Options(format = Array("pretty", "junit:target/junit"))
class CalculatorSteps extends ScalaDsl with EN with ShouldMatchers {

  var input = ""
  var output: Int = 0

  Given("""^the input "([^"]*)"$"""){ (in:String) =>
    input = in
  }

  When("""^the calculator is run$"""){ () =>
    output = new Calculator().evaluate(input)
  }

  Then("""^the output should be "([^"]*)"$"""){ (expected:Int) =>
    assertEquals(expected, output)
  }
}
