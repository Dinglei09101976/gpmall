package com.gupaoedu.pay.dto;

import com.gpmall.commons.result.AbstractResponse;
import lombok.Data;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
@Data
public class PaymentResponse extends AbstractResponse{
    private static final long serialVersionUID = 436341660723282981L;

    private String htmlStr; //构建html表单

    private String prepayId; //微信支付下单的返回id
    private String codeUrl; //微信支付下单构建的二维码地址
}
