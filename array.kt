fun main(){


	var arr = arrayOf("one","two","three")
	var arr1 = arrayOf(1,2,3)

	for(i in arr){
	println(i)
	}

	for((i,e) in arr1.withIndex()){
	println("$i -$e")
	}

	println(arr[0])
	println(arr.get(1))
	arr.set(0,"Hello")
	println(arr[0])
	println(arr.size)
}