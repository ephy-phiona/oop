fun main(){
 var toyota=Car("Toyota","Mark x","KDD 729K",0)
 toyota.start()
    println(toyota.make)
    println(toyota.speed)
    println(toyota.model)
    toyota.accelerate(30)
    println(toyota.speed)
    toyota.hoot()
    println(toyota.speed)
    toyota.decelerate(10)
    println(toyota.speed)
    toyota.stop(20)
    println(toyota.speed)
    println(toyota.speed)
    var info=Student("Tamara Oloo",15)
    println(info.name)

}
class Car(var make: String,var model: String,var registration:String,var speed:Int){
    fun start(){
        println("Chogio gio gio, vroooom")
    }
    fun accelerate(acceleration: Int):Int{
       speed+=acceleration
        return speed
    }
    fun hoot(){
        println("peep peep")
    }
    fun decelerate(deceleration: Int):Int{
       speed-= deceleration
        return speed
    }
    fun stop(num:Int):Int{
        speed=0
        return speed
    }

}
data class Student(var name:String,var age:Int)


