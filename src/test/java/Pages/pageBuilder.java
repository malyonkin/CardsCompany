package Pages;

public class pageBuilder {
    public static loginPage buildLoginPage() {
        return new loginPage("/login");
    }

    /*public static BalancePage buildBalancePage() {
        DepositForm depositForm = new DepositForm();
        WithdrawalForm withdrawalForm = new WithdrawalForm();
        return new BalancePage("/balance", depositForm, withdrawalForm);
    }*/
}
