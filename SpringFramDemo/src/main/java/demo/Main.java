package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Staff staff = context.getBean(Nurse.class);
//        staff.assist();

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
    }
}

//    Nurse nurse = (Nurse) context.getBean("nurse1");
//        doctor.assist();
//        nurse.assist();

//        Staff staff = context.getBean(Nurse.class);
//        staff.assist();