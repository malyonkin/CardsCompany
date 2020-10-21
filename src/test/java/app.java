import Pages.loginPage;
import Pages.pageBuilder;

public class app {
    //Это главный класс в данном модуле. В конструкторе класса App создаются все страницы
    public Pages.loginPage loginPage;

    public app() {
        loginPage = pageBuilder.buildLoginPage();
    }
}
