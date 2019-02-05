import java.util.*
import kotlin.collections.ArrayList

fun microAndArrayUpdate() {
    val reader = Scanner(System.`in`)
    val testCases = reader.nextLine().toInt()
    for(cases in 1..testCases) {
        val inputsAndLimit = reader.nextLine().split(" ")
        val noOfInputs = Integer.parseInt(inputsAndLimit.get(0))
        val limits = Integer.parseInt(inputsAndLimit.get(1))
        var count = 0;
        var inputs : MutableList<Int> = reader.nextLine()
                .split(" ")
                .map {  s: String -> Integer.parseInt(s) }
                .toMutableList()
        var i = 0
        while(i < noOfInputs - 1) {
            if(inputs.get(i) < limits) {
                for (j in 0..(noOfInputs - 1)) {
                    inputs.set(j, inputs.get(j) + 1)
                }
                count++
                i = 0
            } else {
                i++
                continue
            }
        }
        println(count)
    }
}

fun sumOfTwoArray() {
    val reader = Scanner(System.`in`)
    val input1 = reader.nextLine()
    val input2 = reader.nextLine()
    val input3 = { {1; 2}; {3; 4}}
    var array1 = input1.split(" ")
            .map { s: String -> Integer.parseInt(s) }
            .listIterator()
    var array2 = input2.split(" ")
            .map { s: String -> Integer.parseInt(s) }
            .listIterator()
    var sumArray : ArrayList<Int> = ArrayList()
    while(array1.hasNext() || array2.hasNext()) {
        sumArray.add(array1.next() + array2.next())
    }

    println(sumArray)
}

fun binaryQuries() {
    val reader = Scanner(System.`in`)
    val input1 = reader.nextLine()
            .split(" ")
            .map { s: String -> Integer.parseInt(s) }
            .toMutableList()
    val input2 = reader.nextLine()
            .split(" ")
            .map { s: String -> Integer.parseInt(s) }
    val input3 = reader.nextLine()
            .split(" ")
            .map { s: String -> Integer.parseInt(s) }
    var sum = 0
    if(input2.get(0) == 0) {
        input1.set(input3.get(1), input1.get(input3.get(1)))
        var sublist = input1.subList(input2.get(1), input2.get(2))
        for(i in sublist.size - 1 downTo 0 ) {
            sum = sum + sublist.get(i) * Math.pow(2.toDouble(), i.toDouble()).toInt()
        }
    } else if(input3.get(0) == 0){
        input1.set(input2.get(1), input1.get(input2.get(1)).inv())
        var sublist =  input1.subList(input3.get(1), input3.get(2))
        for(i in sublist.size - 1 downTo 0 ) {
            sum = sum + sublist.get(i) * Math.pow(2.toDouble(), i.toDouble()).toInt()
        }
    }

    println(sum)
}


fun memoriseMe() {
    val reader = Scanner(System.`in`)
    val inputList = reader.nextLine()
            .split(" ")
            .map { s: String -> Integer.parseInt(s) }
    while(reader.hasNext()) {
        var value = reader.nextInt()
        var count = 0
        for(i in 0..inputList.size - 1) {
            if(inputList.get(i) == value) {
                count++
            }
        }
        println(count)
    }
}

fun maximizeEarning() {
    val reader = Scanner(System.`in`)
    val earning = reader.nextLine()
    val inputList = reader.nextLine()
            .split(" ")
            .map { s: String -> Integer.parseInt(s) }
    var buildingHeight = 0
    var count = 0
    for(i in 0..inputList.size -1) {
        if(inputList.get(i) > buildingHeight) {
            buildingHeight = inputList.get(i)
            count++
        } else {
            continue
        }
        println(""+buildingHeight + " " + count)
    }
    println(count.times(Integer.parseInt(earning)))
}

fun findMaxMarks() {
    val reader = Scanner(System.`in`)
    val inputList = reader.nextLine()
            .split(" ")
            .map { s: String -> Integer.parseInt(s) }

    for(i in 0.. inputList.size - 1) {
        for(j in i + 1.. inputList.size - 1 ) {
            if(inputList.get(j) > inputList.get(i)) {
                print(inputList.get(j))
            } else {
                continue
            }
        }
    }
    print(inputList.last())
}