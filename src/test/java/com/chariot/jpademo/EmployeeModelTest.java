package com.chariot.jpademo;

import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.regex.Matcher;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@ContextConfiguration(locations =
        "classpath:META-INF/spring/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class EmployeeModelTest {

    @PersistenceContext
    private EntityManager entityManager;

    private Employee testEmployee;

    @Before
    public void createEmployeeData() {
        testEmployee = new Employee();
        testEmployee.setFirstName("Joe");
        testEmployee.setLastName("Smith");
        entityManager.persist(testEmployee);
        for (int i = 0; i < 10; i++) {
            Review r = new Review();
            r.setReview("This was the worst.  " + i);
            testEmployee.addReview(r);
        }
        entityManager.flush();
    }

    @Test
    public void checkBeforeEmployeeCreated() {
        assertNotNull(testEmployee.getId());
    }
    
    @Test
    public void modifyReviewOfEmployee() {
        Review review = (Review) entityManager.createQuery("select r from Review r").getResultList().get(0);
        review.setReview("lkajsdflkasjdflkasjdf");
        review.getEmployee().setFirstName("Phil");

        System.err.println(entityManager.getDelegate());

        entityManager.merge(review);
        System.err.println("==== after merge ====");
        System.err.println(entityManager.getDelegate());
        entityManager.flush();
    }
}
