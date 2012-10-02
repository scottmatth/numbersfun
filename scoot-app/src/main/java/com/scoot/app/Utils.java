package com.scoot.app;


import java.util.Hashtable;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Scott
 * Date: 1/17/11
 * Time: 5:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Utils {
    public static final String ONE = "One";
    public static final String TWO = "Two";
    public static final String THREE = "Three";
    public static final String FOUR = "Four";
    public static final String FIVE = "Five";
    public static final String SIX = "Six";
    public static final String SEVEN = "Seven";
    public static final String EIGHT = "Eight";
    public static final String NINE = "Nine";
    public static final String TEN = "Ten";
    public static final String ELEVEN = "Eleven";
    public static final String TWELVE = "Twelve";
    public static final String THIRTEEN = "Thirteen";
    public static final String FIFTEEN = "Fifteen";
    public static final String TWENTY = "Twenty";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String FIFTY = "Fifty";
    public static final String SIXTY = "Sixty";
    public static final String SEVENTY = "Seventy";
    public static final String EIGHTY = "Eighty";
    public static final String NINETY = "Ninety";
    public static final String TEEN = "teen";
    public static final String HUNDRED = "Hundred";
    public static final String THOUSAND = "Thousand";
    public static final String MILLION = "Million";

//    public static Map<String, String> numberMap = new Hashtable<String, String>();
    public static Map numberMap = new Hashtable();

    static {
        numberMap.put("1", Utils.ONE);
        numberMap.put("2", Utils.TWO);
        numberMap.put("3", Utils.THREE);
        numberMap.put("4", Utils.FOUR);
        numberMap.put("5", Utils.FIVE);
        numberMap.put("6", Utils.SIX);
        numberMap.put("7", Utils.SEVEN);
        numberMap.put("8", Utils.EIGHT);
        numberMap.put("9", Utils.NINE);
        numberMap.put("10",Utils.TEN);
        numberMap.put("11", Utils.ELEVEN);
        numberMap.put("12", Utils.TWELVE);
        numberMap.put("13", Utils.THIRTEEN);
        numberMap.put("15", Utils.FIFTEEN);
        numberMap.put("20", Utils.TWENTY);
        numberMap.put("30", Utils.THIRTY);
        numberMap.put("40", Utils.FORTY);
        numberMap.put("50", Utils.FIFTY);
        numberMap.put("60", Utils.SIXTY);
        numberMap.put("70", Utils.SEVENTY);
        numberMap.put("80", Utils.EIGHTY);
        numberMap.put("90", Utils.NINETY);

    }

    public static String findNumberValue(final long numberIn) {
        StringBuilder numberValue = new StringBuilder("");

        if(0 != numberIn) {

            String strNumber = String.valueOf(numberIn);
            int length = strNumber.length();

            switch (length) {
                case 7:
                    numberValue.append(numberMap.get(strNumber.substring(0,1)));
                    numberValue.append(" ");
                    numberValue.append(Utils.MILLION);
                    numberValue.append(" ");
                    numberValue.append(Utils.findNumberValue(Integer.valueOf(strNumber.substring(1,length)).intValue()));
                  break;
                case 6:
                    numberValue.append(Utils.findNumberValue(Integer.valueOf(strNumber.substring(0,3)).intValue()));
                    numberValue.append(" ");
                    numberValue.append(Utils.THOUSAND);
                    numberValue.append(" ");
                    numberValue.append(Utils.findNumberValue(Integer.valueOf(strNumber.substring(3,length)).intValue()));
                  break;
                case 5:
                    numberValue.append(Utils.findNumberValue(Integer.valueOf(strNumber.substring(0,2)).intValue()));
                    numberValue.append(" ");
                    numberValue.append(Utils.THOUSAND);
                    numberValue.append(" ");
                    numberValue.append(Utils.findNumberValue(Integer.valueOf(strNumber.substring(2,length)).intValue()));
                  break;
                case 4:
                    numberValue.append(numberMap.get(strNumber.substring(0,1)));
                    numberValue.append(" ");
                    numberValue.append(Utils.THOUSAND);
                    numberValue.append(" ");
                    numberValue.append(Utils.findNumberValue(Integer.valueOf(strNumber.substring(1,length)).intValue()));
                  break;
                case 3:
                    numberValue.append(numberMap.get(strNumber.substring(0,1)));
                    numberValue.append(" ");
                    numberValue.append(Utils.HUNDRED);
                    numberValue.append(" ");
                    numberValue.append(Utils.findNumberValue(Integer.valueOf(strNumber.substring(1,length)).intValue()));
                  break;
                case 2:
                    if(null != numberMap.get(strNumber)) {
                        numberValue.append((String)numberMap.get(strNumber));
                    } else {
                        if("1".equals(strNumber.substring(0,1))) {
                            numberValue.append(numberMap.get(strNumber.substring(1,length)));
                            numberValue.append(TEEN);
                        } else {
                            numberValue.append((String)numberMap.get( String.valueOf(Integer.valueOf(strNumber.substring(0,1)).intValue()*10) ));
                            numberValue.append(" ");
                            numberValue.append((String)numberMap.get(strNumber.substring(1,length)));
                        }
                    }
                  break;
                default:
                    numberValue.append((String)numberMap.get(strNumber));
                  break;

            }
        }

        return numberValue.toString();
    }

}
