package com.bigbirthday.invitation;

import java.util.Arrays;
import java.util.HashMap;

public class LabelPrinter {
    private People guests;
    public LabelPrinter(People guests) {
        this.guests = guests;
    }

    public void print(HashMap<String, String> filter) {
        for (int i = 0; i < this.guests.size(); i++){
            String labelString = "";
            Person person = this.guests.get(i);
            if(filter.get("format").equals("-f")) labelString += person.formal();
            else labelString += person.inFormal();
            String label = createLabel(person, labelString,'|', '-', '+');
            System.out.println(label);
        }
    }

    private String horizontalLine(int length, char symbol){
        char[] line = new char[length+2];
        Arrays.fill(line, symbol);
        return new String(line);
    }

    private String text(int length, String data, char symbol){
        String[] split = data.split("");
        int spaceslength = length - split.length;
        char[] spaces = new char[spaceslength];
        Arrays.fill(spaces, ' ');
        return symbol + " " + data + new String(spaces) + " " + symbol;
    }

    private String createLabel(Person person, String labelString, char sideSymbol, char lineSymbol, char cornerSymbol) {
        String address = person.getAddress();
        String country = person.country();
        int horlen = Math.max(address.split("").length,labelString.split("").length);
        horlen = Math.max(horlen, country.split("").length);
        String top = horizontalLine(horlen, lineSymbol);
        String name = text(horlen, labelString, sideSymbol);
        String address1 = text(horlen, address, sideSymbol);
        String country1 = text(horlen, country, sideSymbol);
        return cornerSymbol + top + cornerSymbol + "\n" + name + "\n" + sideSymbol
                + top + sideSymbol + " \n" + address1 + "\n" + country1 + "\n" + cornerSymbol
                + top + cornerSymbol;
    }
}
