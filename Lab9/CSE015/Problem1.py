import sys
sys.setrecursionlimit(100000)
def factorial(n):
    pass # This is a null statement to prevent an error before code is added.

    if n == 0:
        return 1
    else:
        return n * factorial(n-1)
    
print('factorial(5):', factorial(5))
# Expected 120
