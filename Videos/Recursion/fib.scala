// 1, 1, 2, 3, 5, 8, 13, ...

def fib(n:Int):Int = if(n < 2) 1 else fib(n-1) + fib(n-2)
