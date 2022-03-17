fun main(){
    val User1= User("Rehema",30)
    println("User name: ${User1.name}")
    println("User age: ${User1.age}")


val User2=User("Anna",20)
    println("User name: ${User2.name}")
    println("User age: ${User2.age}")

    val User3=User("karimu",60)
    println("User name: ${User3.name}")
    println("User age: ${User3.age}")



}
class User(val name: String, var age: Int){
}