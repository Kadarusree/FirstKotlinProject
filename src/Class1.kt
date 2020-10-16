import java.lang.Exception

fun main(){
    var a = 10;
    var b : String = "Name";
    println("This is my first programme")
    println(add(a =11))

    try {

    }catch (e :NullPointerException){
        e.printStackTrace();
    }
}

fun add(a: Int, b : Int = 11) : Float{
    return (a+b).toDouble().toFloat()
}