class Solution {
    public String convert(String s, int numRows) {
        // Edge case: if only one row, or the string is shorter than the number of rows
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Place characters in zigzag pattern
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction at the first or last row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into the result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
