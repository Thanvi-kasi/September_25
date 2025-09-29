class Solution:
    def generate(self,ind,subset,ans,nums):
        if(ind==len(nums)):
            ans.append(subset.copy())
            return
        subset.append(nums[ind])
        self.generate(ind+1,subset,ans,nums)
        subset.pop()
        self.generate(ind+1,subset,ans,nums)
    def subsets(self, nums):
        ind = 0
        subset = []
        ans = []
        self.generate(ind,subset,ans,nums)
        return ans
