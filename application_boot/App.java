package org.applicationone.application_boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Details detail = (Details) appContext.getBean("basicDtails");
        detail.display();
    }
}
