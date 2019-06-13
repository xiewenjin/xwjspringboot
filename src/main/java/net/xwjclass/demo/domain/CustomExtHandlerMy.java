package net.xwjclass.demo.domain;

public class CustomExtHandlerMy extends RuntimeException {

    private String code;
    private String msg;

    public CustomExtHandlerMy(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
