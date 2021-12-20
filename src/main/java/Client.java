import java.util.Random;

public class Client implements IClient {
    public Client() {
        nomer = random.nextInt(300);
    }

    public void setRegistryHospital(IRegistryHospital registryHospital)
    {
        this.registryHospital = registryHospital;
    }

    private IRegistryHospital registryHospital;
    Integer nomer = 0;
    Random random=new Random();
    @Override
    public void goToTheHospital() {

        System.out.println("Пришел в больницу");
        registryHospital.goToTheArchive();
        registryHospital.goSchedule();
        registryHospital.goRoute();
        registryHospital.goToTheDoctor();
    }


    public void goToTheArchive() {

            System.out.println("Карта на руках");
        }

        public void goSchedule() {
            System.out.println("Расписание врача посмотрели");
        }

        public void goRoute() {
            System.out.println("Номер кабинета сообщили - "+nomer);
        }

    }

