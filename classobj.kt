fun main(){

    val mustang = Car("mustang", "petrol", 100)
    val beetle = Car("beetle","diesel", 200)

    println(mustang.name)
    println(beetle.name)

    mustang.driveCar()
    beetle.driveCar()
}

class Car(val name: String, val type: String, var kmRan: Int){

    fun driveCar(){//methods or functions are same
    println("$name is driving")
    }

    fun applyBrakes(){
    println("Applied Brakes")
    }
}
