package com.company;

public class DecodeString {

    public static void main(String[] args) {
        String encoded1="4[ab]";
        String encoded2="2[b3[ae2[xz]]]";
        String encoded3="2[b3[ae]]";
        decodeString(encoded1);
        decodeString(encoded2);
        decodeString(encoded3);
    }

    private static void decodeString(String encoded) {
        int positionOpen=0;
        int positionClose=0;
        StringBuilder finalString= new StringBuilder();

        while (encoded.length()>0){
            for (int i = 1; i < encoded.length(); i++) {
                if (encoded.charAt(i)==']'){
                    positionClose=i;
                    break;
                }
                else if(encoded.charAt(i-1)=='['){
                    positionOpen=i-1;
                }
            }
            int multiplier= Integer.parseInt(String.valueOf(encoded.charAt(positionOpen-1)));
            String currentText=encoded.substring(positionOpen+1, positionClose);
            encoded=encoded.substring(0, positionOpen-1)+encoded.substring(positionClose, encoded.length()-1);
            String tempText=finalString.toString();
            StringBuilder appendTemp= new StringBuilder();
            for (int i = 0; i < multiplier; i++) {
                appendTemp.append(currentText).append(tempText);
            }
            finalString.replace(0, finalString.length(), appendTemp.toString());
        }
        System.out.println(finalString.toString());
    }
}
