/*  ArrayList

- Unlike list, ArrayList is possible read/write(mutable)

 */

fun main() {
    PrintArrayListLastElement()
}

fun PrintArrayListLastElement(){
    var arrayList : ArrayList<Int> = arrayListOf() // arrayListOf makes empty arrayList
    arrayList.add(1) // value add to last
    arrayList.add(2)
    arrayList.add(3)

    var lastValue = arrayList.last()
    println(lastValue)
}
