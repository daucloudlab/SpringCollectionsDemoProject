package kz.kaznitu.lessons;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProgram {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml") ;
        CollectionDemo demo = (CollectionDemo)context.getBean("test") ;
        System.out.println(demo);
    }
}
