def subsets(nums):
    n = len(nums)
    total_subsets = 1<<n
    ans=[]
    for val in range(total_subsets):
        lst = []
        for i in range(n):
            if(val&(1<<i)):
                lst.append(nums[i])
        ans.append(lst)
    return ans
nums=list(map(int,input().split()))
print(subsets(nums))                      
