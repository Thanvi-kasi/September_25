class Solution:
    def generate(self,curr_str,ans,Open,Close,n):
        if(Open+Close == 2*n and Open == Close):
            ans.append(curr_str)
            return
        if(Open>n):
            return
        if(Close>Open):
            return
        self.generate(curr_str+"(",ans,Open+1,Close,n)
        self.generate(curr_str+")",ans,Open,Close+1,n)
    def generateParenthesis(self, n: int)
        curr_str = ""
        ans = []
        Open = 0
        Close = 0
        self.generate(curr_str,ans,Open,Close,n)
        return ans
