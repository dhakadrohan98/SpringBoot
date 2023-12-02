package com.dailycodebuffer;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

//    @Override
//    public String toString() {
//        return "Doctor{" +
//                "qualification='" + qualification + '\'' +
//                '}';
//    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean Name method is called.");
    }
}
