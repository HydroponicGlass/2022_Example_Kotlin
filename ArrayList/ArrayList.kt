/*  ArrayList

- Unlike list, ArrayList is possible read/write(mutable)

 */

fun main() {
    var array_list : ArrayList<Int> = arrayListOf() // arrayListOf makes empty arrayList
    array_list.add(1) // value add to last
    array_list.add(2)
    array_list.add(3)
    
    PrintArrayListLastElement(array_list)

}

fun PrintArrayListLastElement(arrayList: ArrayList<Int>){
    var lastValue = arrayList.last()
    println(lastValue)
}