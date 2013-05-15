package com.edpond.cucumberexample.unittests

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class SanityTest extends FunSuite with ShouldMatchers {
	test("sanity is preserved") {
		assert(true)
	}
}