/**
 * 
 */
package com.song.web.tests;

import org.springframework.stereotype.Component;

/**

 * @FileName : ConsolePrinter.java

 * @Project : legacy

 * @Date : 2020. 7. 2. 

 * @작성자 : bit-6

 * @변경이력 :

 * @프로그램 설명 :

 */

public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
