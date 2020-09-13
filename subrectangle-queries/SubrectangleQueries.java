class SubrectangleQueries { 
    private int[][] rectangle; // O(1)

    public SubrectangleQueries(int[][] rectangle) { // O(1)
        this.rectangle = rectangle; // O(1)
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) { // O(M*N)
        for (int i = row1; i <= row2; i++) { // O(M)
            for (int j = col1; j <= col2; j++) { // O(N)
                this.rectangle[i][j] = newValue; // O(1)
            }
        }
    }
    
    public int getValue(int row, int col) { // O(1)
        return this.rectangle[row][col]; // O(1)
    }
}
