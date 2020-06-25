package com.costaroot.objectcounter;

public class ObjectCounter {

    private static int objCount = 0;

    public ObjectCounter() {
        objCount++;
    }

    public static int getObjCount() {
        return objCount;
    }
}
