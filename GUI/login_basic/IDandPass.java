package login_basic;

import java.util.HashMap;

public class IDandPass {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPass() {
        logininfo.put("Kuti", "1234");
        logininfo.put("Vellu", "2345");
        logininfo.put("Cattie", "catpassword");

    }

    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
