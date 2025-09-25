from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str])
        d = defaultdict(list)
        for word in strs: # word ="eat"
            sort_word ="".join(sorted(word))
            d[sort_word].append(word)
        ans = [ ]
        for value in d.values():
            ans. append(value)
        return ans 
