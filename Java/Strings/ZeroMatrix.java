//Zero Matrix - O(n) space
//Write an algorithm such that if an element in MxN array is 0, 
//its entire row and col are 0's
//Can change boolean array to boolen bitVector for smaller space but still O(n)

void setZeros(int[][] matrix) {
    boolean[] row = new boolean[matrix.length];
    boolean[] col = new boolean[matrix[0].length];
    
    //Store the row and col index with value 0
    for(int i = 0; i < matrix.length(); i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 0) {
                row[i] = true;
                col[j] = true;
            }
        }
    }

    //Nullify rows
    for(int i = 0; i < row.length; i++) {
        if(row[j]) {
            nullifyRow(matrix, i);
        }
    }

    //Nullify cols
    for(int j = 0; j < col.length; j++) {
        if(col[j]) {
            nullifyColumn(matrix, j);
        }
    }

    void nullifyRow(int[][] matrix, int row) {
        for(int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    void nullifyColumn(int[][] matrix, int row) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
