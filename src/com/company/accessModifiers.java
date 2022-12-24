/* access modifiers in java
 Access modifiers determine whether other classes can use a
 particular field or particular method Can be public , private ,
 protected or default(no modifiers)
 Modifier       Class       Package       Subclass      World
 Public         Yes           Yes            Yes        Yes
 Protected      Yes           Yes            Yes        No
 Default(No)    Yes           Yes            No         No
 Private        Yes           No             No         No
 */
package com.company;
class c1{
    public int x = 5;
    protected int y = 45;
    int z = 6; // default
    private int a = 78;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class c2 extends c1{ // you should do this in another package

}
public class accessModifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();    // accessible - same class everything accessible
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(a.x); private field not accessible in same package
        c2 s = new c2();
        s.meth1();
        System.out.println(s.x);
        System.out.println(s.y);
        System.out.println("Default"+s.z);
        // System.out.println(s.a); private field not accessible in same package
    }
}
