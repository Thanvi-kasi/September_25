class Solution:
    def frequencySort(self, s: str) -> str:
        d = {}
        
        # Counting the frequency of each character in the string
        for char in s:
            if char in d:
                d[char] += 1
            else:
                d[char] = 1
        
        # Sorting characters by frequency in descending order
        u_d = sorted(d.items(), key=lambda x: -x[1])
        
        # Building the result string
        resultString = ""
        for key, value in u_d:
            resultString += key * value  # Multiply the character by its frequency
        
        return resultString

# Example usage
if __name__ == "__main__":
    solution = Solution()
    input_string = "tree"
    result = solution.frequencySort(input_string)
    print("Sorted by frequency:", result)
