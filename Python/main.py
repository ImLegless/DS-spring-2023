#print("Hello World! \n")



#print(type(name))
#firstName = "Logan"
#lastName = "Gardner"
#fullName = firstName+ " " + lastName
#print("Hello " + fullName)

#age = 21
#age+=1
#print("Your age is "+ str(age))
#print(type(age))

#height = 250.5
#print(height)
#print(type(height))
#print("Your height is: " +str(height))


#This code is very human
#human = True
#print(human)
#print(type(human))

#name = "Logan"
#age = 21
#attractive = True
#name,age,attractive ="Logan",21,True


#print(name)
#print(age)
#print(attractive)

#Spongebob = patrick = sandy = squidward = 30


#name = "logan"

#print(len(name))
#print(name.capitalize())
#print(name.upper())
#print(name.lower())

#
#print(name.isdigit())
#print(name.isalpha())
#print(name.find("g"))
#print(name.replace("l","B"))
#

#print(name.count("o"))
#print(name*3)


#x = 1
#y = 2.0
#z = "3"
#print(float(x),float(y),float(z) *3)
#haha python bad at math
#print(1.0 - 0.9 - 0.1)
#y = int(y)
#print(y)


#name = input("What is your name?")
#age = int(input("How old are you?"))
#height = float(input("How tall are you?"))
#print("Hello " + name)
#print("You are " + str(age) + " years old")
#print("You are "+ str(height) + " cm tall")



#import math

#pi = 3.14
#x = 1
#y = 2
#z = 3

#print(round(pi))
#print(math.ceil(pi))
#print(math.floor(pi))
#print(abs(pi))
#print(pow(pi,2))
#print(math.sqrt(420))
#print(max(x,y,z))
#print(min(x,y,z))




#name = "Logan Gardner"
#firstName=name[:5]
#lastName=name[6:]
#funkyName=name[::2]
#reversedName=name[::-1]
#print(firstName)
#print(lastName)
#print(funkyName)
#print(reversedName)

#website="http://google.com"
#website2="https://www.youtube.com/watch?v=XKHEtdqhLK8&t"

#slice(start,stop,step)
#slice = slice(7,-4)
#print(website[slice])
#print(website2[website2.find("://")+3 : website2.find(".com")+4])

#import math

#age = float(input("How old are you?: "))
#age = math.ceil(age)

#if age >= 100:
#    print("Someone come get their grandparent..old fart")
#elif age >= 18 and age < 100:
#    print("You are an adult")
#elif age < 0:
#    print("You haven't been born once or more yet!")
#else:
#    print("You are a child!")




#temp = int(input("What is the temp: "))

#if not(temp >= 0 and temp <= 30):
#    print("The temp is bad today")
#    print("Kick rocks")
#elif not(temp <0 or temp > 30):
#    print("The temp is good today")
#    print("Touch grass")
    


#name = None
#while not name:
#    name = input("Enter your name: ")
#print("Hello",name)

#for i in range(10):
#    print(i+1)

#for i in range(50,101,2):
#    print(i)

#for i in "Logan Gardner":
#    print(i)

#import time
#for seconds in range(10,0,-1):
#    print(seconds)
#    time.sleep(1)



#NESTED LOOPS
#
#
#
#
#rows = int(input("How many rows: "))
#columns = int(input("How many columns: "))
#symbol = input("Enter a symbol to use:")

#for i in range(rows):
#    for j in range(columns):
#        print(symbol, end="")
#    print()





#Loop control
#
#break   used to terminate the loop
#continue   skips to the next iteration
#pass   does nothing (placeholder)

#while True:
#    name = input("Enter your name: ")
#    if name != "":
#        break

#phone_number = "319-826-5821"
#for i in phone_number:
#    if i == "-":
#        continue
#    print(i, end = "")

#for i in range(1,21):
#    if i ==13:
#        pass
#    else:
#        print(i, end=",")


#LISTS
#
#
#
#
#food = ["pizza","Hotdogs", "Spaghet", "Hamburber"]

#print(food[2])

#food.append("ice cream")
#food.remove("Hotdogs")
#food.pop()
#food.insert(0,"cake")
#food.sort()
#food.clear()

#for x in food:
#    print(x)




#2d LISTS
#
#
#

#drinks = ["coffee","milk","water"]
#dinner = ["pizza","hotdog","hamburber"]
#dessert = ["cake","ice cream"]
#
#food = [drinks,dinner,dessert]
#
#print(food[0][1])



#TUPLES
#student = ("Logan",21,"Male")
#print(student.index("Male"))
#for x in student:
#    print(x)
#if "Logan" in student:
#    print("Logan is here")
























