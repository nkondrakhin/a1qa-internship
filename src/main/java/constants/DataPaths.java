package constants;

public class DataPaths {
    private static final String JSON_DATA_DIRECTORY_PATH = ".\\src\\test\\resources\\%s";
    private static final String SQL_DATA_DIRECTORY_PATH = ".\\src\\test\\resources\\sql-queries\\%s";
    public static final String CONFIG_DATA_PATH = String.format(JSON_DATA_DIRECTORY_PATH, "config-data.json");
    public static final String TEST_DATA_PATH = String.format(JSON_DATA_DIRECTORY_PATH, "test-data.json");
    public static final String API_DATA_PATH = String.format(JSON_DATA_DIRECTORY_PATH, "api-data.json");
    public static final String COOKIE_DATA_PATH = String.format(JSON_DATA_DIRECTORY_PATH, "cookie-data.json");
    public static final String JS_DATA_PATH = String.format(JSON_DATA_DIRECTORY_PATH, "js-data.json");
    public static final String SELECT_TEST_NAMES_QUERY = String.format(SQL_DATA_DIRECTORY_PATH, "selectTestNames.sql"); //todo
    public static final String INSERT_TEST_QUERY = String.format(SQL_DATA_DIRECTORY_PATH, "insertTest.sql");//todo
    public static final String INSERT_ATTACHMENT_QUERY = String.format(SQL_DATA_DIRECTORY_PATH, "insertAttachment.sql");//todo
    public static final String INSERT_LOG_QUERY = String.format(SQL_DATA_DIRECTORY_PATH, "insertLog.sql");//todo

    private DataPaths() throws InstantiationException {
        throw new InstantiationException(String.format("Static %s class should not be initialized", getClass().getSimpleName()));
    }
}
