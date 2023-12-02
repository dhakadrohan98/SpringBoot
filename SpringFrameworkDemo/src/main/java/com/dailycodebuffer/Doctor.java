package com.dailycodebuffer;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "singleton")
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

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct method is called.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroy method is being called.");
    }

}
