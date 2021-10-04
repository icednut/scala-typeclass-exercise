package io.icednut.typeclass.exercise.step01

trait Pet {
  def name: String
  def renamed(newName: String): Pet
}

case class Fish(name: String, age: Int) extends Pet {
  def renamed(newName: String): Pet = copy(name = newName)
}