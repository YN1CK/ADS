package de.hsrm.cs.ads;

public class Mystery {
    static int m1(int x,int z) {
        int returnValue;

        // runs forever, if z is lower zero and x is greater than zero
        assert (z < 0 && x > 0) : "runs forever, if z is lower zero and x is greater than zero";

        if (z == 0) {
            returnValue = x;
        } else if (x == 0) {
            returnValue = z;
        }
        else {
            returnValue = m1(x+1, z-1);
        }

        return returnValue;
    }

    static int m2(int x,int z){
        int returnValue;

        // runs forever, if z is lower zero and x is lower than zero
        assert (z < 0 && x < 0) : "runs forever, if z is lower zero and x is lower than zero";

        if (z == 0) {
            returnValue = x;
        } else if (x == 0) {
            returnValue = 0;
        }
        else {
            returnValue = m2(x-1, z-1);
        }

        return returnValue;
    }

    static int m3(int x,int z){
        int returnValue;

        // runs forever, if x is lower than zero
        assert x < 0 : "runs forever, if x is lower than zero";

        if (x == 0) {
            returnValue = 0;
        } else {
            returnValue = m1(m3(x-1, z), z);
        }

        return returnValue;
    }

    public static void main(String[] args) {
        System.out.println(m3(0, 0));
        System.out.println(m3(1, 0));
        System.out.println(m3(0, 1));
        System.out.println(m3(1, 1));
        System.out.println(m3(-1, -1));
        System.out.println(m3(1, -1));
        System.out.println(m3(-1, 1));

    }
}