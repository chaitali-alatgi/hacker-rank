import java.math.BigInteger
import java.util.*
import kotlin.collections.ArrayList

fun main(args : Array<String>) {
    println("Hello, World!")
//    println(sum())
//    findProduct()
//    countDivisor()
//   calculateFactorial()
//    motuPatlu()
//    sort()
//    vowelsCheck()
//    vowelRecognition()
//    primeNumbersInRange()
 //   println(isPrimeNumber(11))
  //  microAndArrayUpdate()
//    sumOfTwoArray()
//    binaryQuries()
//    memoriseMe()
//    maximizeEarning()
    findMaxMarks()
}


    fun sum() : Int {
        val(a, b)  = readLine()!!.split(" ").map(String :: toInt)
        return a + b
    }

    fun findProduct() {
        val reader = Scanner(System.`in`)
        reader.nextInt()
        val inputs = "1 2 3 4 5";
        var inputArray : List<Char> = inputs.toList()
        var listOfNUmbers : ArrayList<BigInteger> = ArrayList()
//        val listOfNUmbers = inputs.map {
//            if(it != ' ') it.toString().toBigInteger()
//        }
        for(item in inputArray) {
            if(item != ' ') {
               listOfNUmbers.add(BigInteger(item.toString()))
            }
        }

        val module = 1000000007
        var answer = 1
        for(item in listOfNUmbers) {
            answer = answer.times(item.toInt()).rem(module)
        }

        println(answer);
    }

fun countDivisor() {
    val reader = Scanner(System.`in`)
    val inputs = "1 10 3"
    var inputList : List<String> = inputs.split(" ")
    val startNUmber = Integer.parseInt(inputList.get(0))
    val endNUmber = Integer.parseInt(inputList.get(1))
    val divisor = Integer.parseInt(inputList.get(2))
    var count = 0;
    for(number in startNUmber..endNUmber) {
        if(number % divisor == 0) {
            print(number)
            count++
        }
    }

    print(count)
}

fun calculateFactorial() {
    val input = Integer.parseInt("4")
    var factorial = 1;
    for(number in 1..input) {
        factorial = factorial.times(number)
    }

    print(factorial)

}

fun motuPatlu() {
    val reader = Scanner(System.`in`)
    var input = reader.nextInt()
    var round = 1
    var patlu = 0
    var motu = 0
    var person = 0
    while (true) {
        patlu = round + patlu
        if ((patlu + motu) >= input) {
            person = 0
            break
        }
        motu = motu + (round * 2)
        if ((patlu + motu) >= input) {
            person = 1
            break
        }
        round++

    }
    if (person == 0) {
        print("Patlu")
    } else {
        print("Motu")
    }
}


    fun sort() {
        val input = readLine()
        var inputArray = input!!.toCharArray()
        var length = 0;
        while(length < (inputArray.size - 1)) {
            if(inputArray.get(length) > inputArray.get(length + 1)) {
                var temp = inputArray.get(length)
                inputArray.set(length, inputArray.get(length + 1))
                inputArray.set(length + 1, temp)
            }
            length++
        }

        print(inputArray)
    }

fun vowelsCheck() {
    val input = readLine();
    val reg = "[aeiouyAEIOUY]".toRegex()
    var inputArray = input!!.toCharArray()
    var index = 0
    var isValid = true
    var num1 = 0
    var num2 = 0

    while(index < (inputArray.size)) {
        if (!inputArray.get(index).isDigit()) {
            if((inputArray.get(index) in 'a'..'z' || inputArray.get(index) in 'A'..'Z') && !inputArray.get(index).toString().matches(reg)) {
                isValid = false
                println("char= "+inputArray.get(index)+" ans= "+ isValid)
                break
            } else if(!(inputArray.get(index) in 'a'..'z' || inputArray.get(index) in 'A'..'Z')){
                index++
                continue
            }
        }
        if(!((num1 + num2) % 2 == 0)){
            isValid = false
            break
        }
        println("num1= "+num1+" num2= "+num2 +" ans= "+ isValid+" index= "+index)
        if(index < inputArray.size) {

            if(inputArray.get(index).isDigit()) {
                num1 = Integer.parseInt(inputArray.get(index)+"")
            }
            if(index < inputArray.size - 1 && inputArray.get(index + 1).isDigit()) {
                num2 = Integer.parseInt(inputArray.get(index + 1)+"")
            }

            index++
        }
    }
    if(isValid) {
        print("YES")
    } else {
        print("NO")
    }
}

fun vowelRecognition() {
    val input = readLine()
    val vowels = "[aeiouyAEIOUY]".toRegex()
    var count = 0
    var set: MutableSet<String> = mutableSetOf()
    for(i in 0..input!!.length) {
        for(j in i..input!!.length - 1) {
            set.add(input.substring(i, j))
            set.add(input.substring(j))
            println(input.substring(i, j))
            println(input.substring(j))
        }
    }
    for(item in set) {
        for(letter in item.toCharArray()) {
            if (letter.toString().matches(vowels)) {
                count++
            }
        }
    }
    print(set.toString() +" count= "+count)
}

fun isPrimeNumber(inputNumber : Int) : Boolean {
    var isPrime = false
    for(i in 2..inputNumber/2) {
        if(inputNumber%i == 0) {
            isPrime = true
            break
        }
    }
    if(!isPrime) {
        return true
    } else {
        return false
    }
}

fun primeNumbersInRange() {
    val input = readLine()!!
    var list = input.split(" ")
    var start = Integer.parseInt(list.get(0))
    var end = Integer.parseInt(list.get(1))
    for(i in start..end) {
        if(isPrimeNumber(i)) {
            var sum = 0
            var num = i
            while (num > 0) {
                sum = sum + num % 10
                num = num / 10
            }
            if(isPrimeNumber(sum)) {
                println(i)
            }
        }
    }

}