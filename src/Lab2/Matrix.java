package Lab2;

public class Matrix implements Addable {
    protected int[][] Numbers;
    protected int M , N;

    public Matrix( int m , int n ) {
        M = m ;
        N = n ;
        Numbers = new int[m][n];
    }

    public boolean setNumbers( int[] numbers ) {
        if( numbers.length != N * M ) return false;

        for( int i=0 ; i<M ; i++) 
            for( int j=0 ; j<N ; j++) 
                Numbers[i][j] = numbers[j + i*M];

        return true;
    }

    public void Transpose() {
        int n = M , m = N;
        int[][] transpose = new int[m][n];

        for( int i=0 ; i<M ; i++) 
            for( int j=0 ; j<N ; j++) transpose[i][j] = Numbers[j][i];

        Numbers = transpose;
        N = m ;
        M = n;
    }

    public void Print() {
        for( int i=0 ; i<M ; i++) {
            for( int j=0 ; j<N ; j++) System.out.print( Numbers[i][j] + " " );
            System.out.println();
        }
    }

    @Override
    public Matrix add( Addable m ) {

        Matrix B = (Matrix) m;

        if( B.M != M || B.N != N ) {
            throw new ArithmeticException("Un matched Dimensions");
        }

        Matrix C = new Matrix(M,N);

        for( int i=0 ; i<M ; i++) 
            for( int j=0 ; j<N ; j++)
                C.Numbers[i][j] = this.Numbers[i][j] + B.Numbers[i][j];
        
        return C;
    }
}
