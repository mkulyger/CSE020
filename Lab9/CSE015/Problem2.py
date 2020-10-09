def fib(n):
    pass # This is a null statement to prevent an error before code is added.
 
    if (n == 1):
     return 0;
    if (n == 2):
        return 1 #(0+1)=1
    else:
        return fib(n-1) + fib(n-2);


print('fib(8):', fib(8))

# Expected 13
# that is the end of problem 2 --------------------------------------------
