fun main() {
   //OQIM THREAD PATOK
   println(Thread.currentThread().name)

   val thread1=Thread{
      for (i in 0..10){
         println(i)
         Thread.sleep(1000)
      }
   }
   val thread2=Thread{
      for (i in 10..20){
         println(i)
         Thread.sleep(2000)
      }
   }
   thread1.start()
   thread1.join()
   thread2.start()

}