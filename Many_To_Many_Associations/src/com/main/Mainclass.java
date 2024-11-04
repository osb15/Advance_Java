package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Courses;
import com.entity.Students;

public class Mainclass {
    public static void main(String[] args) {
        SessionFactory sf = null;
        Session ss = null;
        Transaction tr = null;

        try {
            Configuration cfg = new Configuration();
            cfg.configure(); // Load hibernate.cfg.xml
            cfg.addAnnotatedClass(Students.class);
            cfg.addAnnotatedClass(Courses.class);

            sf = cfg.buildSessionFactory();
            ss = sf.openSession();
            tr = ss.beginTransaction();

            // Creating Course instances
            Courses c1 = new Courses();
            c1.setCid(101);
            c1.setSname("Computer");

            Courses c2 = new Courses();
            c2.setCid(102);
            c2.setSname("Electrical");

            // Creating Student instance
            Students s1 = new Students();
            s1.setID(1);
            s1.setName("Varad");

            // Adding courses to the student
            List<Courses> courseList = new ArrayList<>();
            courseList.add(c1);
            courseList.add(c2);
            s1.setCourses(courseList);

            // Adding student to each course
            List<Students> studentList = new ArrayList<>();
            studentList.add(s1);
            c1.setStudents(studentList);
            c2.setStudents(studentList);

            // Saving the objects
            ss.save(c1);
            ss.save(c2);
            ss.save(s1);

            tr.commit();
            System.out.println("Data saved successfully");
        } catch (Exception e) {
            if (tr != null) {
                tr.rollback();
            }
            e.printStackTrace();
        } finally {
            if (ss != null) {
                ss.close();
            }
            if (sf != null) {
                sf.close();
            }
        }
    }
}
