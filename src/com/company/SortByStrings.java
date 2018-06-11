package com.company;

public class SortByStrings {

    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("good");
        StringBuilder t= new StringBuilder("odg");
        System.out.println(sortByStrings(s,t));
    }

    private static StringBuilder sortByStrings(StringBuilder s, StringBuilder t) {
        StringBuilder newString= new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            while (s.indexOf(String.valueOf(t.charAt(i)))>=0){
                int position= s.indexOf(String.valueOf(t.charAt(i)));
                newString.append(s.charAt(position));
                s.deleteCharAt(position);
            }
        }
        return newString;
    }
}
