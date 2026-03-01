fun main(){
	
	println(addition(1,2))

	// println(addition(1.0,2.0))

	println(addition(a=1.0,b=2.0))

	//store function invariable
	var fn:(Int, Int)->Int = ::addition
	println(fn(1,2))

	var fn2:(Double,Double) -> Double = :: addition
	println(fn2(1.0,2.0))
}

fun addition(a: Int,b: Int) : Int{
	return a+b
}

fun addition(a: Double, b:Double): Double{
	return a+b
}
