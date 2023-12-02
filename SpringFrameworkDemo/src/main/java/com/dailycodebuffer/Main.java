package com.dailycodebuffer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(Doctor.class);
        System.out.println("Before creating a Bean");
        Doctor doctor = context.getBean(Doctor.class);
        System.out.println("After creating a Bean");
        doctor.setQualification("MBBS");
        System.out.println(doctor.getQualification());
        context.close();

//        Doctor doctor1 = context.getBean(Doctor.class);
//        System.out.println(doctor1.getQualification());
    }
//    Nurse nurse = (Nurse)context.getBean("nurse1");
//        System.out.println(nurse);
//    String qualification = doctor.getQualification();
//        System.out.println("Doctor qualification: "+qualification);
}