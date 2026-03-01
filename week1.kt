

fun getBioLength(bio: String?): Int{

    var ans= bio?.length ?:0

    return ans
}


//or

fun getBioLength(bio: String?) bio?.length ?: 0

----------------------------------------------

fun getAppRoute(code: Int) = when(code){ 200-> "Success"
 401, 403->"Auth Error"
 else -> "Unknown" }

--------------------

data class Transaction(

id:Int,
amoutn: Double,
category: String ="General"

)
