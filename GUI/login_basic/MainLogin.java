package login_basic;

public class MainLogin {
    public static void main(String[] args) {
        IDandPass idPassInfo = new IDandPass();

        LoginPage loginPage = new LoginPage(idPassInfo.getLogininfo());
    }
}
