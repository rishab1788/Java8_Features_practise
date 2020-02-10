package Genrics;

//comes in 1.5 version
//Generics
/*
to provide type saftey,to resolve type casting.
Type Safety->Array list is type safe -
like we can add any string and integer at the same time.
al.add("Risahbh")
al.add(254561)



Generics in Java is similar to templates in C++.
The idea is to allow type (Integer, String, … etc and user defined types)
to be a parameter to methods, classes and interfaces. For example,
classes like HashSet, ArrayList, HashMap, etc use generics very well. We can use them for any type.
 */
public class a_basic<T> {
    T obj;

    public void m1(T name) {
        System.out.println(name);
    }

    public static void main(String... args) {
        a_basic a = new a_basic();
        a.m1("name");
        a.m1(15648949);
        a.m1(46415.646848);
        a_basic<String> a1 = new a_basic();// this adds constraints
        a1.m1("name");
        //a1.m1(16855);  --- this is not allowed.
        a_basic<Integer> a2 = new a_basic();
        a2.m1(1618516);

    }

}

