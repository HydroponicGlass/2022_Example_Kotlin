enum class EnumClass(val string : String, val value : Int){
    a("a", 0),
    b("b", 1),
    c("c", 2)
}

fun main() {
   EnumClass.values().forEach{
       print("${it.string}, ${it.value}\n")
   }
}