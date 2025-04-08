package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Ejercicio2Test extends AnyFunSuite {
  val objEjercicio2 = new Ejercicio2()

  test("Conversión de 10 a hexadecimal") {
    val resultado = objEjercicio2.toHexString(10).take(10).toList
    val esperado = List("A","B","C","D","E","F","10","11","12","13")
    assert(resultado == esperado)
  }

  test ("Conversión de 100 a hexadecimal") {
    val resultado = objEjercicio2.toHexString(1).take(100).toList
    val esperado = List("1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","10","11","12","13","14","15","16","17","18","19","1A","1B","1C","1D","1E","1F","20","21","22","23","24","25","26","27","28","29","2A","2B","2C","2D","2E","2F","30","31","32","33","34","35","36","37","38","39","3A","3B","3C","3D","3E","3F","40","41","42","43","44","45","46","47","48","49","4A","4B","4C","4D","4E","4F","50","51","52","53","54","55","56","57","58","59","5A","5B","5C","5D","5E","5F","60","61","62","63","64")
    assert(resultado == esperado)
  }
}
