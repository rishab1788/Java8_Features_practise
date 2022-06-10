package Java8features;

import java.awt.*;
import java.util.*;
/**
 * Difference between Comparable and Comparator
 * Comparable and Comparator both are interfaces and can be used to sort collection elements.
 *
 * However, there are many differences between Comparable and Comparator interfaces that are given below
 *
 * */

// Difference ->

/**
 *
 *       Comparable	     Comparator
 * 1)
 *    Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price.
 *    The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
 * 2)
 *    Comparable affects the original class, i.e., the actual class is modified.
 *    Comparator doesn't affect the original class, i.e., the actual class is not modified.
 * 3)
 *    Comparable provides compareTo() method to sort elements.
 *    Comparator provides compare() method to sort elements.
 * 4) Comparable is present in java.lang package.
 *    A Comparator is present in the java.util package.
 * 5)
 *    We can sort the list elements of Comparable type by Collections.sort(List) method.
 *    We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
 *    */


class StudentComparableExample implements Comparable {
    int rollNumber;
    @Override
    public int compareTo(Object o) {
        // if return -1 (negative 15 bhi ho to chlega ) than it states that current object is big .
        //if return 0 than means its equal.
        // if return +1 that means its smaller
        // String also use the comparable
        StudentComparableExample s = (StudentComparableExample) o;
        if( s.rollNumber >  rollNumber){ return -1;}
        else if( s.rollNumber <  rollNumber){return 1;}
        return 0;
        /* above this can be replace by
        *  return rollnumber - s.rollNumber;  */
    }

    public static void sort(){
      // List<StudentComparableExample> list  = new ArrayList();
        // Collections.sort(list);
    }
}
class StudentComparatorExample implements Comparator {
    int rollNumber;

     @Override
    public int compare(Object o, Object t1) {
        return ((StudentComparatorExample)o).rollNumber - ((StudentComparatorExample)t1).rollNumber;
    }
    public static void sort() {
        java.util.List<StudentComparableExample> list  = new ArrayList();
        Collections.sort(list);
        Collections.sort(list,(t2, t1) -> t1.rollNumber - t2.rollNumber); // giving custom sort
    }
}



public class G_ComparatorvsComparable implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }



    /**  Comparator present in java.util. package and it defines two methods
     * compare and equals
     */

}

/** Sorting with multiple fields */
class GFG
{
    static class Pair implements Comparable {
        public int data;
        public int freq =1;

        @Override
        public int compareTo(Object o) {
            int res = ((Pair)o).freq-freq;
            if(res==0){
                res = data - ((Pair)o).data;
            }
            return res;
        }
    }
    public static void SortByFreq(int a[],int n){
        Set h = new HashSet();
        ArrayList<Pair> pairs= new ArrayList();
        for(int i = 0;i<n;i++){ // 0 1 2 ,3 4
            pairs.add(new Pair()) ;
            pairs.get(i).data = a[i];
            for(int j = 0;j<n;j++){ //1 2 3 4
                if(a[j] == a[i] && i!=j){  // 01,02,03,04
                    pairs.get(i).freq++;
                }
            }
        }
        Collections.sort(pairs);
        for(Pair p : pairs){
            System.out.print(  p.data + " ");
        }
    }
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i =0;i<t;i++){
            int n = scan.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = scan.nextInt();
            }
            SortByFreq(a,n);
            System.out.println();
        }
    }
}