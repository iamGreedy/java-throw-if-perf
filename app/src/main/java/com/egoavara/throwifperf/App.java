/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.egoavara.throwifperf;

import java.util.regex.Pattern;

public class App {
    public static Pattern COMPLEX_NUMERIC = Pattern.compile("^(\\+|\\-)?[0-9]+$");
    public static Pattern SIMPLE_NUMERIC = Pattern.compile("^(\\+|\\-)?[0-9]+$");

    public boolean checkWithThrow(String parameter) {
        try {
            int serverId = Integer.parseInt(parameter);
            if (serverId == 0)
                return false;
            return true;
        } catch (Exception e) {
            return true;
        }
    }
    public boolean checkWithComplexRegex(String parameter) {
        if(COMPLEX_NUMERIC.matcher(parameter).matches()){
            int serverId = Integer.parseInt(parameter);
            if (serverId == 0)
                return false;
            return true;
        }else{
            return true;
        }
    }
    public boolean checkWithSimpleRegex(String parameter) {
        if(SIMPLE_NUMERIC.matcher(parameter).matches()){
            int serverId = Integer.parseInt(parameter);
            if (serverId == 0)
                return false;
            return true;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        
    }
}
