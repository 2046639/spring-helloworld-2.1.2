import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        boolean resHelloWorld = bean1 == bean2;

        System.out.println("bean1= " + bean1);
        System.out.println("bean2= " + bean2);
        System.out.println("resHelloWorld= " + resHelloWorld);

        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());

        Cat beanCat1 = (Cat) applicationContext.getBean("hellocat");
        Cat beanCat2 = (Cat) applicationContext.getBean("hellocat");
        boolean resHellocat = beanCat1 == beanCat2;

        System.out.println("beanCat1= " + beanCat1);
        System.out.println("beanCat2= " + beanCat2);
        System.out.println("resHellocat= " + resHellocat);
    }
}