package com.edpond.cucumberexample.systemtest.sanity

import cucumber.api.scala.{EN, ScalaDsl}
import cucumber.api.junit.Cucumber
import org.junit.Test
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers

@Test
@RunWith(classOf[Cucumber])
@Cucumber.Options(format = Array("junit:target/junit"))
class SanitySteps extends ScalaDsl with EN with ShouldMatchers {
  Given("""^a doohicky$"""){ () =>
  //// Express the Regexp above with the code you wish you had
  }
  When("""^a foobar is red$"""){ () =>
  //// Express the Regexp above with the code you wish you had
  }
  Then("""^the light should be on$"""){ () =>
  //// Express the Regexp above with the code you wish you had
  }
}
