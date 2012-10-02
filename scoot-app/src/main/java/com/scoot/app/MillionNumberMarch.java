package com.scoot.app;


/**
 * Created by IntelliJ IDEA.
 * User: Scott
 * Date: 1/16/11
 * Time: 9:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class MillionNumberMarch {


    public MillionNumberMarch() {


    }

    public static String numberStringBuilder(final long numberMax) {

        StringBuilder numberOutput = new StringBuilder("Zero");
        for(int currNum = 1; currNum <= numberMax; currNum++) {
            numberOutput.append("(");
            numberOutput.append(String.valueOf(currNum));
            numberOutput.append(") => ");
             if(null != Utils.numberMap.get(String.valueOf(currNum))) {
                 numberOutput.append(Utils.numberMap.get(String.valueOf(currNum)));
             } else {
                 numberOutput.append(Utils.findNumberValue(currNum));
             }
            numberOutput.append("\n");
        }


        return numberOutput.toString();
    }


}
