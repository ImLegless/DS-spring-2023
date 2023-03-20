



list = [4,6,7,1,2,34,5,7]





def listProduct(list):
    product = 1

    for x in list:
        product = product * x
    return product


#def hailstone(n):
#
#    hail = str(n)+" "
#    while(n != 1):
#        if n%2 == 0:
#            n = n/2
#            hail = hail+str(int(n)) +" "
#        elif n % 2 == 1 and n != 1:
#            n = n*3+1
#            hail = hail+str(int(n)) +" "
#
#    return hail


def hailstone(n):
    hail = ""
    if n == 1:
        return "1"
    elif n%2 == 0:
        return hail  + str(int(n))+ " " + hailstone(n/2)
    elif n%2 == 1 and n!= 1:
        return hail  + str(int(n))+ " " + hailstone(3*n+1)


def countDigit(n,digit):
    
    if n < 10 and n == digit:
        return 1
    elif n == 0 or (n!= digit and n<10):
        return 0
    elif n%10 == digit:
        return 1 +countDigit(n//10,digit)
    return countDigit(n//10,digit)
    
    

print(listProduct(list))
print(hailstone(13))
print(countDigit(708850324,3))


















