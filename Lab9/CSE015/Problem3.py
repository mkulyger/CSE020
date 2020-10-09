def addup(list):
    pass # This is a null statement to prevent an error before code is added.
    if len (list)==0:
        return 0
    else :
        return list [0] + addup(list[1:]) #accessing the remainder of the list 
print('addup([1,2,3,4,5]):', addup([1,2,3,4,5]))
# Expected 15
print('addup(range(101)):', addup(range(101)))
# Expected 5050
