class Solution { 
    public boolean isValid(String s) {
        // Stack to keep track of the opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Mapping of closing brackets to their corresponding opening brackets
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        
        for (char ch : s.toCharArray()) {
            // If it's a closing bracket, check if it matches the top of the stack
            if (bracketMap.containsKey(ch)) {
                // Pop the top element from the stack, or set a dummy value if the stack is empty
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                // If the top element doesn't match the corresponding opening bracket, return false
                if (bracketMap.get(ch) != topElement) {
                    return false;
                }
            } else {
                // If it's an opening bracket, push it onto the stack
                stack.push(ch);
            }
        }
        
        // If the stack is empty, all brackets matched; otherwise, return false
        return stack.isEmpty();
    }
}
