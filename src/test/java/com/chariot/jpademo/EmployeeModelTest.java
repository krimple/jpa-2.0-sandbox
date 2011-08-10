package com.chariot.jpademo;

import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.runner.RunWith;
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
public class EmployeeModelTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Transactional
    public void tryOutEmployee() {

        Employee e = new Employee();
        e.setFirstName("Joe");
        e.setLastName("Banks");
        entityManager.persist(e);

        assertThat(e.getId(), notNullValue());
        
        entityManager.clear();

        Employee e2 = entityManager.find(
                Employee.class, e.getId());

        assertThat(e2.getId(), notNullValue());
        assertThat(e2, not(e));
    }
}
