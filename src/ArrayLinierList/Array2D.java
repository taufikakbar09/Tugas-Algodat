package ArrayLinierList;

public class Array2D {
    public static Object[][] changeLength2D(Object [] a, int n, int m, int newLength, int newLengthBaru){
        if(n > newLength){
            throw new IllegalArgumentException("Length is too small");
        }
        if(m > newLengthBaru){
            throw new IllegalArgumentException("Length is too small");
        }
        if(a != null){
            Object[][]copy = new Object [newLength][newLengthBaru];
            for (int i = 0; i <a.length; i++){
                final Object []row = (Object[]) a[i];
                copy[i] = new Object[newLengthBaru];
                System.arraycopy(row, 0, copy[i], 0, row.length);
            }
            return copy;
        }
        return null;
    }
    public static Object [][]changeLength2D(Object[][] a, int newLength, int newLengthBaru){
        return(Object[][]) changeLength2D(a,a.length, a[0].length, newLength, newLengthBaru);
    }
}
