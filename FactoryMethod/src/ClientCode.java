public class ClientCode {
    private static Application application;
    public static void main(String[] args) {
        String fileType="txt";
        configure(fileType);
        runBusinessLogic();
    }
    static void configure(String fileType)
    {
        if ("txt".equalsIgnoreCase(fileType)) {
            application = new TxtApplication();
        } else if ("csv".equalsIgnoreCase(fileType)) {
            application = new CSVApplication();
        }
    }

    static void runBusinessLogic()
    {
        application.newDocument();
    }
}
