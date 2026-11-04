package com.jm.springcaptchademo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "captcha")
public class CaptchaProperties {

    private Integer width;
    private Integer height;
    private Integer codeCount;
    private Integer lineCount;

}
