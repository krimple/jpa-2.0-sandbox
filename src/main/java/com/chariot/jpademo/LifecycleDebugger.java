package com.chariot.jpademo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

//@Component
public class LifecycleDebugger implements BeanFactoryPostProcessor, Ordered {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory
                                                   configurableListableBeanFactory)
            throws BeansException {

        String[] beanNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for(String name : beanNames) {
            System.err.println(name);
            
            
        }


    }

    @Override
    public int getOrder() {
        return 100;
    }
}
