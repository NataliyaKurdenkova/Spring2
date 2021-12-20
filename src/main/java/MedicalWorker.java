public class MedicalWorker {
    public Client getClient()

    {
        Client client = new Client();
        IRegistryHospital registryHospital = new Dentistry();
        client.goToTheArchive();
        client.goSchedule();
        client.goRoute();
        client.setRegistryHospital(registryHospital);
        return client;
    }
}
