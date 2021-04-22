package Lab2;

public class IdentityMatrix extends Matrix {

    public IdentityMatrix( int L ) {
        super( L , L );
    }

    @Override
    public boolean setNumbers( int[] numbers ) {
        if( numbers.length != N * M ) return false;

        for( int i=0 ; i<M ; i++) 
            for( int j=0 ; j<N ; j++) {
                Numbers[i][j] = numbers[j + i*M];

                if( i==j && Numbers[i][j] != 1) return false;
                if( i!=j && Numbers[i][j] != 0) return false;
            }

        return true;
    }

    @Override
    public void Transpose() { ; }
}
