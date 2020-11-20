package com.lpz.grace.result;

/**
 * @author Create by lpz
 * @date 2020-11-20 20-37-30
 * 描述: 自定义响应数据结构
 * 		本类可提供给 H5/ios/安卓/公众号/小程序 使用
 *		前端接受此类数据（json object)后，可自行根据业务去实现相关功能
 *
 * 		200：表示成功
 * 		500：表示错误，错误信息在msg字段中
 * 		501：bean验证错误，不管多少个错误都以map形式返回
 * 		502：拦截器拦截到用户token出错
 * 		555：异常抛出信息
 * 		556: 用户qq校验异常
 * 		557: 校验用户是否在CAS登录，用户门票的校验
 */
public class LPZJSONResult {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    private String ok; // 不使用

    public static LPZJSONResult build(Integer status, String msg, Object data) {
        return new LPZJSONResult(status, msg, data);
    }

    public static LPZJSONResult build(Integer status, String msg, Object data, String ok) {
        return new LPZJSONResult(status, msg, data, ok);
    }

    public static LPZJSONResult ok(Object data) {
        return new LPZJSONResult(data);
    }

    public static LPZJSONResult ok() {
        return new LPZJSONResult(null);
    }

    public static LPZJSONResult errorMsg(String msg) {
        return new LPZJSONResult(500, msg, null);
    }

    public static LPZJSONResult errorUserTicket(String msg) {
        return new LPZJSONResult(557, msg, null);
    }

    public static LPZJSONResult errorMap(Object data) {
        return new LPZJSONResult(501, "error", data);
    }

    public static LPZJSONResult errorTokenMsg(String msg) {
        return new LPZJSONResult(502, msg, null);
    }

    public static LPZJSONResult errorException(String msg) {
        return new LPZJSONResult(555, msg, null);
    }

    public static LPZJSONResult errorUserQQ(String msg) {
        return new LPZJSONResult(556, msg, null);
    }

    public LPZJSONResult() {

    }

    public LPZJSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public LPZJSONResult(Integer status, String msg, Object data, String ok) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.ok = ok;
    }

    public LPZJSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
