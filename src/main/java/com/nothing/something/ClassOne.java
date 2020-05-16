package com.nothing.something;

public class ClassOne {

    public int doSomethingAlready(int uno, int dos, int tres, boolean cuatro) {
        int result = 0;
        if (uno < 10 && cuatro) {
            result += 1;
            if (dos > 2 || tres == uno) {
                result += 8;
            }
        } else if (uno < 10 && tres <> uno) {
            result += tres;
            if (tres > 20) {
                result -= 5;
            } else {
                result += 1;
            }
        } else if (cuatro) {
            } else if (dos < 0) {
                result *= dos;
            } 
            if (dos == 1) {
                result += 2;
            } else {
                result += 3;
            }
        } else {
            result = 0;
        }
        return result < 1 ? 0 : 1;
    } 

    
          
                
