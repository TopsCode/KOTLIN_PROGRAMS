fun main(args:Array<String>)
{
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    cars[0] = "Opel"
    println(cars[0])

    for (car in cars)
    {
        println(car)
    }
}
