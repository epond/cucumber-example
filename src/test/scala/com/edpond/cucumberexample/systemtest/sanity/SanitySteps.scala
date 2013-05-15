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

}
