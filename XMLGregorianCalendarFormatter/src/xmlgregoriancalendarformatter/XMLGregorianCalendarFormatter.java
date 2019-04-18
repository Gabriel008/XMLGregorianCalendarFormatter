/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlgregoriancalendarformatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Gabriel Valenzuela
 */

public class XMLGregorianCalendarFormatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        System.out.println("XMLGregorianCalendar Formatter tutorial");
        System.out.println();
        
        GregorianCalendar gCal = new GregorianCalendar();
        gCal.setTime(new Date());
        XMLGregorianCalendar gDateUnformated = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
        System.out.println("Unformatted date: " + gDateUnformated);	
        System.out.println();
                
        
        String FORMATER = "yyyy-MM-dd'T'HH:mm:ss";
        DateFormat format = new SimpleDateFormat(FORMATER);
        Date date = new Date();
        XMLGregorianCalendar gDateFormatted1 =
            DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
        System.out.println("Formatted using SimpleDateFormat: " + gDateFormatted1.toString());
        
        
        
        
//  SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
//  Date date=simpleDateFormat.parse(dateToBeParsed);
//  GregorianCalendar gc=new GregorianCalendar();
//  gc.setTime(date);
//  XMLGregorianCalendar xml=DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
//  xml.setTimezone(0);
//  return xml.toString();
               
                
        String FORMATER1 = "yyyy-MM-dd'T'HH:mm:ss";
        DateFormat format1 = new SimpleDateFormat(FORMATER1);
        Date date1 = format1.parse("2019-02-01T13:28:47");
        XMLGregorianCalendar gDateFormatted11 =
            DatatypeFactory.newInstance().newXMLGregorianCalendar(format1.format(date1));
        System.out.println("Formatted using SimpleDateFormat1: " + gDateFormatted11.toString());
        
        
        
        Calendar cal = Calendar.getInstance();
        XMLGregorianCalendar gDateFormatted2 =
            DatatypeFactory.newInstance().newXMLGregorianCalendar(
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE),
                cal.get(Calendar.SECOND), DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED);
        System.out.println("Formatted using FIELD_UNDEFINED:  " + gDateFormatted2);
    }
    
}
