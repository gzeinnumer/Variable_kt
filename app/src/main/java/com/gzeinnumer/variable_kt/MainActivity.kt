package com.gzeinnumer.variable_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.math.BigInteger
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("main1")
        //todo 1
        var sport = "Swimming"
        val jarak = 50 // final variable cant change next
        println(sport) //Swimming
        println(jarak) //50

        //todo 2
        val a: Int = 10000
        val d: Double = 100.00
        val f: Float = 100.00f
        val l: Long = 100000000004
        val s: Short = 10
        val b: Byte = 1

        println("Value Int $a") //10000
        println("Value Double $d") //100.00
        println("Value Float $f") //100.00f
        println("Value Long $l") //100000000004
        println("Value Short $s") //10
        println("Value Byte $b") //1

        //todo 3
        val key : Char // final variable
        key = 'c' // put value here
        println("$key") //c

        val keputusan = true
        println("$keputusan") //true

        val str1 = "Company"
        val str2 = """GZeinNumer
            M. Fadli Zein
        """

        println(str1) //Company
        println(str2) //GZeinNumer
        //M. Fadli Zein


        //todo 6
        val it = "satu" // returns Array<String?>
        val arrStr2 = Array<String>(5) { "it = $it" }
        val arrStr3 = arrayOf("a", "b", "c")


        main2("Param1")
        main3()
        main4(arrStr2) //arrStr3
        main5()
        main6()
        main7()
        main8()
        main9()
        main10()
        main11()
        main12()
        main13()
        main14()
        main15()
        main16()
        main17()
        main18()
        main19()
        main20()
        main21()
        main22()
        main23()
        main24()
        main25()
        main26()
        main27()
        main28()
        main29()
        main30()
        main31()
        main32()
        main33()
        main34()

    }

    //todo 4
    fun main2(args : String){
        println("main2")
        val numbers : IntArray = intArrayOf(1,2,3,4,5)
        println("Hy I Am "+numbers[2]) //Hy I Am 3
    }

    //todo 5
    fun main3(){
        println("main3")
        val numbers : MutableList<Int> = mutableListOf(1,2,3) // you can chang this value
        val readOnly : List<Int> = listOf(1,2,3)

        println("Imutable before--"+numbers) //[1, 2, 3]
        numbers.add(4)
        println("Imutable after--"+numbers) //[1, 2, 3, 4]

        println("Imutable readOnly--"+readOnly) //[1, 2, 3]
    }

    //todo 7
    fun main4(args : Array<String>){
        println("main4")
        val i: Int=2
        for(j in 1..4)
            print(j)//1234

        if(i in 1..10){ //less than 10 more than 1
            println("Number"+i) //Number2
        }
    }

    //todo 8
    fun main5(){
        println("main5")
        var object1=genericsExample<String>("KOTLIN") //Terpanggil Oleh Input KOTLIN
        var object2=genericsExample<Int>(10) //Terpanggil Oleh Input 10
    }

    //todo 9
    fun main6(){
        println("main6")
        var object1=genericsExample<Double>(10.00)
        var object2=genericsExample<Int>(10)
        println(object1)//Terpanggil Oleh Input 10.0
        println(object2)//Terpanggil Oleh Input 10
    }

    //todo 10
    class genericsExample<T>(input : T){
        init {
            println("Terpanggil Oleh Input "+input)
        }
    }

    //todo 11
    fun main7(){
        println("main7")
        val integer : Int = 1
        val number : Number = integer // auto parse
        println(number)//1
    }

    //todo 12
    fun main8(){
        println("main8")
        val number1 = 12.5
        val number2 = 5.5
        var result:Double
        result = number1 + number2
        println(result)//18.0
        result = number1 - number2
        println(result)//7.0
        result = number1 * number2
        println(result)//68.75
        result = number1 / number2
        println(result)//2.27272
        result = number1 % number2
        println(result)//1.5

        val str1 = "Aku"
        val str2 = "Kotlin"
        val resultStr = str1 + str2

        println(resultStr) //AkuKotlin
    }

    //todo 13
    fun main9(){
        println("main9")
        val number1 = 12.5
        val number2 = 5.5
        //a+b
        println(number1.plus(number2))//18.0
        println(number1.minus(number2)) //7.0
        println(number1.times(number2))//68.75
        println(number1.div(number2))//2.27272
        println(number1.rem(number2))//1.5

        val str1 = "Aku"
        val str2 = "Kotlin"

        println(str1.plus(str2))//AkuKotlin
    }

    //todo 14
    fun main10(){
        println("main10")
        val number1 = 10
        //a+=b
        println(-number1) //-10
    }

    //todo 15
    fun main11(){
        println("main11")
        val a = -12
        val b = 12

        val max = if(a>b){
            println("a besar dari b")
            a
        } else{
            println("b besar dari a")
            b
        }
        println(max)//12
    }

    //todo 16
    fun main12(){
        println("main12")
        val a = 10
        val b = 9
        val c = -1
        val result : Boolean
        result = (a>b) && (a>c)
        println(result) //true

    }

    //todo 17
    fun main13(){
        println("main13")
        val numbers = intArrayOf(1,4,42,-3)
        if(4 in numbers){ // if there avaliable value with 4 than true
            println("Array berisikan 4")
        }
    }

    //todo 18
    fun main14(){
        println("main14")
        val n1 = 3
        val n2 = 2
        val n3 = 3

        val max = if(n1>n2){
            if (n1>n3)
                n1
            else
                n3
        } else {
            if(n2 > n3) n2 else n3
        }
        println("$max")
    }

    //todo 19
    fun main15(){
        var num = 3
        var numProvided =  when(num){
            1-> "satu"
            2-> "dua"
            3-> "3"
            4-> "empat"
            else-> "Wrong number"
        }
        println(numProvided) //tiga
    }

    //todo 20
    fun main16(){
        println("main16")
        for(i in 1..5) println(i) //1 2 3 4 5
        println()

        print("for(i in 5 downTo 1) print(i) = ")
        for(i in 5 downTo 1) println(i) //4 3 2 1

        print("for(i in 1..5 step 2) print(i) = ")
        for(i in 1..5 step 2) println(i) //3 5

        print("for(i in 5 downTo 1 step 2) print(i) = ")
        for(i in 5 downTo 1 step 2) println(i) //3 1
    }

    //todo 21
    fun main17(){
        println("main17")
        val language = arrayOf("Ruby","Kotlin","Python","Java")
        for (item in language.indices){
            if(item%2==0){
                println(language[item]) //Ruby Python
            }
        }
    }

    //todo 22
    fun main18(){
        println("main18")
        var text = "Kotlin"
        for(letter in text){
            println(letter)
        }
        //K
        //o
        //t
        //l
        //i
        //n
    }

    //todo 23
    fun main19(){
        println("main19")
        var text = "Kotlin"
        for(letter in text.indices){
            println(text[letter])
        }
        //K
        //o
        //t
        //l
        //i
        //n
    }

    //todo 24
    fun main20(){
        println("main20")
        var i = 1
        println(i++)
        var k = 1
        println(++k)
    }

    //todo 25
    fun main21(){
        println("main21")
        var i = 1
        while(i<=5){
            println("Line $i")
            ++i
        }
        //Line 1
        //Line 2
        //Line 3
        //Line 4
        //Line 5
    }

    //todo 26
    fun main22(){
        println("main22")
        var a =1
        do{
            //d something
            a+=1
        } while (a>5)
    }

    //todo 27
    fun main23(){
        println("main23")
        first@ for(i in 1..4) {
            second@ for (j in 1..2) {
                println("i = $i; j = $j")
                if (i == 2) {
                    break@first //to break for first@ parent loop
                    //break@second //to break for second@
                }
            }
        }
        //i = 1; j = 1
        //i = 1; j = 2
        //i = 2; j = 1
    }

    //todo 28
    fun main24(){
        println("main24")
        for(i in 1..4) {
            if (i == 2) {
                continue //to skip 2
            }
            println(i)
        }
        //134
    }

    //todo 29
    fun main25(){
        println("main25")
        first@ for(i in 1..4) {
            if (i == 2) {
                continue@first //to skip 2
            }
            println(i)
        }
        //134
    }

    //todo 30
    fun main26(){
        println("main26")
        val n =10
        val first = BigInteger("0")  //string to integer
        val second = BigInteger("1")
        println(ervan(n,first,second)) // 55
    }

    tailrec fun ervan(n: Int, a: BigInteger, b: BigInteger): BigInteger {
        return if(n==0) a else ervan(n-1, b , a+b)
    }

    //todo 31
    //lambda
    fun main27(){
        println("main27")
        val greeting = {
            println("i am a function")
        }

        greeting()
    }

    //todo 32
    fun main28(){
        println("main28")
        val product = {a : Int, b : Int -> a * b}
        /*
        fun pruduct(a: Int, b: Int) : Int{
            return a*b
        }
         */
        println(product(9,3))
    }

    //todo 33
    fun main29(){
        println("main29")
        var string : String? = "Hello!"
//        println(string.length) //error you have hgive known strig not null
        if (string != null){
            println(string.length)
        }
    }

    //todo 34
    fun main30(){
        println("main30")
        val mes:String? =null
        println(mes!!) //if value null wont display null
    }

    //todo 35
    fun main31(){
        println("main31")
        val a: List<Int?> = listOf(1,2,3,null)
        val b: List<Int> = a.filterNotNull() //to remove null in index 3
    }

    //todo 36
    fun main32(){
        println("main32")
        var a :String? = "Nullable String Value"
        val b: Int = if (a != null) a.length else -1
        val c = a?.length ?: -1
    }

    //todo 37
    fun main33(){
        println("main33")
        val string: String? = "Hello World!"
//        println(string.length)// error
        println(string?.length)
    }

    //todo 38
    fun main34(){
        println("main34")
        //read only List<String>
        val list = listOf("Item 1","Item 2")
        println(list) //[Item 1, Item 2, Item 3]

        //read only Map<Integer, String>
        val maps = mapOf(Pair(1, "Item 1"), Pair(2, "Item 2"))
        println(maps)//{"1=Item 1, 2=Item 2", 3=Item 3}
        //read only Set<String>
        val set = setOf(1,2,3)
        println(set) //[1,2,3]
    }


}
