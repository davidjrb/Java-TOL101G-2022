/******************************************************************************
 *  Nafn    : Davíð James Róbertsson Berman
 *  T-póstur: djr1@hi.is
 *
 *  Lýsing  :
 *
 *****************************************************************************/
public class Minnsta {
    /**
     * Returns the minimum value in the specified array.
     *
     * @param a the array
     * @return the minimum value in the array {@code a[]};
     */
    private static double min(double[] a) {

        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    /**
     * Returns the minimum value in the specified array.
     *
     * @param a the input array
     * @return the minimum value in the array {@code a[]};
     */
    public static double[] minnsta(double[] a) {
        double[] minnst = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            int Nj = a.length - i;
            double[] jLo = new double[Nj];
            int jj = 0;
            for (int j = i; j < a.length; j++) {
                jLo[jj] = a[j];
                jj++;
            }
            minnst[i] = min(jLo);
        }
        return minnst;
    }

    public static void main(String[] args) {
        double[] x1 = { 1.0, 2.0, 3.0 };
        double[] y1 = minnsta(x1);
        for (double i : y1)
            System.out.print(" " + i);
        System.out.println();
        double[] x2 = { 1.0, 3.0, 6.0, 2.0 };
        double[] y2 = minnsta(x2);
        for (double i : y2)
            System.out.print(" " + i);
        System.out.println();
    }
}
