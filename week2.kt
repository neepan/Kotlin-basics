fun String.addHastag(): String{
return "#${this}"
}
//--------------
//or
fun String.addHashtag() = "#$this"

//----------------------------------------------------

val myTransaction = listOf(
Transaction(id= 1, amount=150.0, category="Food"),
Transaction(id = 2, amount = 800.0, category = "Rent"),
Transaction(id = 3, amount = 50.0, category = "Coffee")
)

val foodTransactoins = myTransaction.filter{ it.category =="Food"}


//-----------------------------------------------

transaction?.let{
    println("${it.amount}")
    println("Transaction Loaded")
}

//-------------------------------

@Composable
fun QuickAddExpense(){

var balance by remember {mutableStateOf(0.0)}

Button(onClick={balance+=100.0}){
 Text("Total Spent: $balance")
}
}
