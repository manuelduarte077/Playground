fun main(){
  fizzbuzz(
    start = 1,
    end = 100
  )
}


fun fizzbuzz(start: Int, end: Int) { 

    for (i in start..end) { // loop from start to end
        if (i % 3 == 0 && i % 5 == 0) println("fizzbuzz") // if divisible by 3 and 5
        else if (i % 3 == 0) println("fizz") // if divisible by 3
        else if (i % 5 == 0) println("buzz") // if divisible by 5
        else println(i) // else print the number
    }
}