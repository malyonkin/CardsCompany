public class testConfig {
    //Из этого класса можно достать настройки с которыми запускаются тесты. Также здесь указаны настройки по умолчанию.
    //Тесты запускаются командой mvn test -Dbrowser=chrome -Dheadless=1
    //Значения переменных достаются из командной строки и благодаря классу TestConfig становятся доступны в тестах и в приложении.
    //Можно например менять url приложения в зависимости от окружения (dev, stage, production).
    public static String browser = "chrome";
    public static String headless = "1";

    public static void initConfig() {
        browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        headless = System.getProperty("headless") == null ? "1" : System.getProperty("headless");
    }

    public static boolean isHeadless() {
        return headless.contains("1");
    }
}
