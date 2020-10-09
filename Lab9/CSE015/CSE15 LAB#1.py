print("Question #1")
name = input("Enter your name: ")
print("Hello, " + name)
print()

print("Question #2")
a = input("Enter an integer: ")
x = int(a)
if (x%2 == 0):
    print("EVEN")
else:
    print("ODD")
print()

print("Question #3")
x = 10
integer = []
for i in range( 0, int(x)):
    integer.append(int(input("Enter Number: ")))

maxnum = 0
for i in integer:
    if i > maxnum:
       maxnum = i

print("Max number is: " + str(maxnum))
print()

print("Question #4")
x = 10
integer2 = []
odd = []
for i in range( 0, int(x)):
    integer2.append(int(input("Enter Number: ")))
    if integer2[i] % 2 == 1: 
        odd.append(integer2[i])
        maxnum2 = odd[0]
    
if (len(odd) > 0):
    for mod2 in odd:
        if mod2 > maxnum2:
            maxnum2 = mod2
        print("Max number is: " + str(maxnum2))
else:
    print("No odd numbers were entered")
