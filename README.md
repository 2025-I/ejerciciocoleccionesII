# Ejercicios maps y evaluación perezosa

## Ejercicio 1

Modificar el archivo Ejercicio1.scala para generar un mapeo para la traducción de números decimales a su representación binaria que es una cadena de 0 y 1, la cual tiene tamaño 8. Esto debe retornar

Para esto modificar la función

```scala
def toBinaryString(n: Int): Map[Int,String] = {
//Completar
}
```

Ejemplo:

```scala
test("Conversión de 10 a binario") {
    val resultado = objEjercicio1.toBinaryString(10)
    val esperado = Map(1 -> "00000001", 2 -> "00000010", 3 -> "00000011", 4 -> "00000100", 5 -> "00000101", 6 -> "00000110", 7 -> "00000111", 8 -> "00001000", 9 -> "00001001", 10 -> "00001010")
    assert(resultado == esperado)
  }
```

```

```

**Importante** Debe usar expresiones for para resolver este problema.

## Ejercicio 2

Modificar el archivo Ejercicio2.scala para generar los números en base 16 desde n en adelante usando evaluación perezosa. Para esto modificar la función

```scala
def toHexString(n: Int): LazyList[String] = {
  //Completar
}
```

Ejemplo:

```scala
  test("Conversión de 10 a hexadecimal") {
    val resultado = objEjercicio2.toHexString(10).take(10).toList
    val esperado = List("A","B","C","D","E","F","10","11","12","13")
    assert(resultado == esperado)
  }
```
