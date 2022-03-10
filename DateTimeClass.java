package com.mycompany.maven_trial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dorothy22
 */
public class DateTimeClass {
    public DateTimeClass(){
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate localDate=LocalDate.now();
        System.out.println(dtf.format(localDate));
    }
    
    
}
