n = int(input())
factorsCount = 0
for i in range(1,n+1):
    if(n%i==0):
        factorsCount=factorsCount+1
if(factorsCount==2):
    print("Prime")
else:
    print("Not a Prime")
