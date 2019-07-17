package test;

/**
 * @author footman77
 * @create 2018-11-29 22:13
 */
public class Bird {

    protected static int referenceCount = 0;

    public Bird(){
        referenceCount++;
    }

    protected void fly(){

    }

    static int getRefCount(){
        return referenceCount;
    }

}
