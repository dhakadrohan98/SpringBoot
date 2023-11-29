package com.dailycodebuffer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Staff staff = context.getBean(Doctor.class);
        Nurse nurse = (Nurse)context.getBean("nurse1");
        System.out.println(nurse);
        staff.assist();
        nurse.assist();
    }
}