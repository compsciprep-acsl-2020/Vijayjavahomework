public class Rotateleft {
    public static void main(String[] args ) {
        int array[]= {1,2,3};
        array[0]=array[1];
        for( int i=1; i<=3; i++)
        {
            System.out.println( array[i]);
        }
    }


}
