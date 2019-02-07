public class Matrix {
    private int row;
    private int column;
    private int[][] elements;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.elements = new int[row][column];
    }

    public Matrix(int length){
        this.row = length;
        this.column = length;
        this.elements = new int[length][length];
    }

    public Matrix(int[][] elements){
        this.row = elements.length;
        this.column = elements[0].length;
        this.elements = elements;
    }

    public int getRow() {
        return elements.length;
    }

    public int getColumn() {
        return elements[0].length;
    }

    public int[][] getElements() {
        return this.elements;
    }

    public boolean add(Matrix newMatrix) {
        if(this.row == newMatrix.getRow() && this.column == newMatrix.getColumn())
        {
            for(int i=0; i<this.row;i++)
                for (int j=0; j< this.column; j++)
                    this.setElement(i, j, elements[i][j] + newMatrix.getElements()[i][j]);

            return true;
        }
        else
            return false;
    }

    public void setElement(int i, int j, int value){
        elements[i][j] = value;
    }

    public boolean isSquareMatrix() {
        if(this.row == this.column)
            return true;
        else
            return false;
    }

    public void toLowerTriangular() {
        if(this.isSquareMatrix())
            for (int i = 0; i < this.row; i++)
                for (int j = i + 1; j < this.column; j++)
                    this.elements[i][j] = 0;
    }

    public void toUpperTriangular() {
        if(this.isSquareMatrix())
            for(int i=0; i<this.row; i++)
                for(int j=0; j<i; j++)
                    this.elements[i][j] = 0;
    }


    

}
