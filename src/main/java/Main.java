import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
      // MedicalWorker medicalWorker=new MedicalWorker();
      // medicalWorker.getClient().goToTheHospital();
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        IClient client=context.getBean("client",IClient.class);
        System.out.println("Клиент 1");
        client.goToTheHospital();
        IClient client2=context.getBean("client",IClient.class);
        System.out.println("Клиент 2");
        client2.goToTheHospital();
    }

}
