package com.design.designpatterns.singleton.pay;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/5 9:02
 * Description:
 */
@Data
public class MsgResult implements Serializable {

    private Integer code;

    private Object data;

    private String msg;

    public MsgResult(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
