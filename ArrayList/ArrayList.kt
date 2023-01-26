/*  ArrayList

- Unlike list, ArrayList is possible read/write(mutable)

 */

fun main() {
    // PrintArrayListLastElement()
    // SortArrayList()
    // SortClassArrayList()
}

fun PrintArrayListLastElement(){
    var arrayList : ArrayList<Int> = arrayListOf() // arrayListOf makes empty arrayList
    arrayList.add(1) // value add to last
    arrayList.add(2)
    arrayList.add(3)

    var lastValue = arrayList.last()
    println(lastValue)
}

fun SortArrayList(){
    var basicArrayList : ArrayList<Int> = arrayListOf() // arrayListOf makes empty arrayList
    basicArrayList.add(1) // value add to last
    basicArrayList.add(3)
    basicArrayList.add(2)

    /* Ascending order */
    basicArrayList.sortBy{it}
    println(basicArrayList) /* [1, 2, 3] */

    /* Descending order */
    basicArrayList.sortByDescending{it}
    println(basicArrayList) /* [3, 2, 1] */
}

fun SortClassArrayList(){
    val sortTestClass = arrayListOf<Pair<Int, Int>>()
    sortTestClass.add(Pair(5, 3))
    sortTestClass.add(Pair(3, 6))
    sortTestClass.add(Pair(8, 2))

    /* Ascending order */
    sortTestClass.sortBy{it.first}
    println(sortTestClass) /* [(3, 6), (5, 3), (8, 2)] */

    /* Descending order */
    sortTestClass.sortByDescending{it.first}
    println(sortTestClass) /* [(8, 2), (5, 3), (3, 6)] */
}