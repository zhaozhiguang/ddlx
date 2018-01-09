package cn.ddsxy.ddlx.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

public class CaptchaUserNamePassWordToken extends UsernamePasswordToken {

    private String catcha;

    public String getCatcha() {
        return catcha;
    }

    public void setCatcha(String catcha) {
        this.catcha = catcha;
    }

    public CaptchaUserNamePassWordToken(String username, String passwrod, String catcha) {
        super(username, passwrod);
        this.catcha = catcha;
    }

}
