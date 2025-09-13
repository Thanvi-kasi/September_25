def checkPrimeorNot(num):
    count = 0
    for i in range(1,num+1):
        if(num%i==0):
            count+=1
    if(count==2):
        return True
    else:
        return False
n=int(input())
Sum = 0
while(n!=0):
    rem = n%10
    if(checkPrimeorNot(rem)):
        Sum+=rem
    n = n//10
print(Sum)     
