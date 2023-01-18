class matrix{
    private int rows, columns;
    private int[][] m;
    void set_rows(int x)
    {
        rows = x;
    }
    void set_cols(int x)
    {
        columns = x;
    }

    
    void set_matrix()
    {
        m = new int[rows+1][columns+1] ;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                m[i][j] = i*j;
            }
        }
    }

    void add_matrix(int row_new, int col_new)
    {
        if(row_new == rows && col_new == columns)
        {
            System.out.println("Matrices are addable");
        }
        else
        {
            System.out.println("Matrices are NOT addable");
        }
    }
}

public class matrices {
    public static void main(String[] args) {
        matrix m = new matrix();
        m.set_rows(4);
        m.set_cols(3);
        m.set_matrix();
        m.add_matrix(4, 9);
    }
}
