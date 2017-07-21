package com.jackframe.prototype.jdk;

/**
 * Created by jack on 21/07/2017.
 */
public class VerifyClone implements Cloneable {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        VerifyClone verifyClone = new VerifyClone();
        verifyClone.setCode(1);

        try {
            VerifyClone verifyClone1 = (VerifyClone)verifyClone.clone();
            System.out.println(verifyClone1.getCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
