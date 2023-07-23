#1-Basic 

for x in range(0, 151, 1):
 print(x)


 #2-Multiples of Five

 for x in range(5,1000,1):
   print(x*5)


#3-Counting, the Dojo Way

def Counting():
    for i in range (1,101,1):
        if i % 5 == 0:
            print ('Coding')
        if i % 10 == 0:
            print ('Dojo')
Counting()


#4-Whoa. That Sucker's Huge

def whoaThatSuckersHuge():
    sum = 0
    for i in range(0,500001):
        sum += i
    print(sum)


#5- Countdown by Fours

def Count_downby_Fours():
   for i in range(2018,-1,-4):
       print(i)  
Count_downby_Fours()


#6-#Flexible Counter 

def flex_countdown(low, high, mult):
    for i in range (low, high):
        if i % mult == 0:
            print (i)
flex_countdown(2,9,3)