import java.util.Random;

public class Dentistry implements IRegistryHospital{
    Integer nomer = 0;
    Random random=new Random();

    public Dentistry() {
        nomer = random.nextInt(300);
    }

    @Override
    public void goToTheArchive() {
        System.out.println("Карта на руках");
    }
    @Override
    public void goSchedule() {
        System.out.println("Расписание врача посмотрели");
    }
    @Override
    public void goRoute() {
        System.out.println("Номер кабинета сообщили - "+nomer);
    }

    @Override
    public void goToTheDoctor() {
        System.out.println("Направили к стоматологу");
    }
}
