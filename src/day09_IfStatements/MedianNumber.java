package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10,
                b=20,
                c=30;
        boolean aIsMedian = ((a > b) && (a < c)) || a > c && a < b;// if(a>b && a<c)|| (a>c && a<b)

        boolean bIsMedian= (b>c && b<a) || (b>a&&b<c);// if ( b>a && b<c ) || (b<a &&b>c )

        boolean cIsMedian = !aIsMedian && !bIsMedian;
       /*boolean cIsMedian;
       if (!aIsMedian && !bIsMedian) cIsMedian = true;
       else cIsMedian = false;
     */
if (aIsMedian){
    System.out.println("aIsMedian = " + aIsMedian);
}
if (bIsMedian){
    System.out.println("bIsMedian = " + bIsMedian);
}
if (cIsMedian){
    System.out.println("cIsMedian = " + cIsMedian);
}





    }






}
