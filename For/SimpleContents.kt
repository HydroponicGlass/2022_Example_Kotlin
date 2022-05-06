fun main()
{
    /* Print Index And Value */
    var testList = listOf(10,20,30,40,50)
    for((index, value) in testList.withIndex()){
        print("${index}, ${value}\n")
    }
}