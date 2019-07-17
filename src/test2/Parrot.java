package test2;

import test.Bird;

/**
 * @author footman77
 * @create 2018-11-29 22:15
 */
public class Parrot extends Bird {
    public void fly(){
        System.out.println("parrot's fly");
    }

    public int getRefCount(){
        return referenceCount;
    }

    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.getRefCount();
    }
}
