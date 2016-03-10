package com.bigbirthday.invitation;

import java.util.HashMap;


public class CliOptions {

    public HashMap<String, String> parse(String[] args) {
        HashMap<String, String> options = new HashMap<>();
        for (int index = 0; index < args.length; index++) {
            if (args[index].startsWith("-")) {
                if (args[index].equals("-f") || args[index].equals("-if")) {
                    options.put("format", args[index]);
                } else {
                    options.put(args[index].substring(1, 2), args[index + 1]);
                    index++;
                }
            }
        }
        if (!options.containsKey("format")) {
            options.put("format", "-f");
        }
        return options;
    }
}
