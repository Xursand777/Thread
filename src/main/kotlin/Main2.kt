fun main(){

    val myarray= arrayOf(2,4,6,8)
        try {
            println(myarray.get(4))
        }catch (e:Exception){
            println(e.toString())
        }catch (e:ArithmeticException){

        }finally {
            println("Ishladi")
        }

}