package Lab2;

public class TestApp {
    public static void main(String[] args) {

        Matrix A = new Matrix( 3 , 3 ) ;
        IdentityMatrix B = new IdentityMatrix( 3 ) ;

        int[] arr = {1,2,3 ,4,5,6 ,7,8,9};
        int[] Identity = {1,0,0 ,0,1,0 ,0,0,1};

        // A
        A.setNumbers( arr );
        A.Print();
        System.out.println();

        // Transpose A
        A.Transpose();
        A.Print();
        System.out.println();

        // B Identity Check
        if( B.setNumbers( Identity ) ) {

            // Add Transpose A , B
            Matrix C = A.add(B);
            C.Print();
            System.out.println();            
        }

        Matrix D = new Matrix( 2 , 3 );
        int[] arr2 = {0,0,0,0,0,0};
        D.setNumbers( arr2 );
        try {
            D.add(A);
        } catch(Exception e) {
            System.out.println("Error: " + e);
            System.exit(-1); 
        }
    }
}
