package com.edpond.cucumberexample

class Calculator {
  def evaluate(input: String): Int = {
    val expression: Array[String] = input.split('+')
    expression(0).toInt + expression(1).toInt
  }
}
