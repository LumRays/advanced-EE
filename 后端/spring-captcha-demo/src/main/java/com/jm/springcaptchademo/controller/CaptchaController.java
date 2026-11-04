package com.jm.springcaptchademo.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ICaptcha;
import com.jm.springcaptchademo.constant.Constant;
import com.jm.springcaptchademo.entity.CaptchaProperties;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {

    @Autowired
    private CaptchaProperties captchaProperties;

    @RequestMapping("/getCaptcha")
    public void getCaptcha(HttpSession session, HttpServletResponse response) {

        // 生成验证码
        ICaptcha captcha = CaptchaUtil.createLineCaptcha(captchaProperties.getWidth(), captchaProperties.getHeight(),
                                                        captchaProperties.getCodeCount(), captchaProperties.getLineCount());
        try {
            response.setContentType("image/jpeg");
            // 设置 session
            session.setAttribute(Constant.SESSION_CAPTCHA_NAME, captcha.getCode()); // 验证码内容
            session.setAttribute(Constant.SESSION_DATE_NAME, System.currentTimeMillis()); // 生成时间
            //禁止缓存
            response.setHeader("Pragma", "No-cache");
            captcha.write(response.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                response.getOutputStream().close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @RequestMapping("/check")
    public Boolean check(String captcha, HttpSession session) {

        if (!StringUtils.hasLength(captcha)) {
            return false;
        }
        // 获取验证码
        String captchaCode = (String) session.getAttribute(Constant.SESSION_CAPTCHA_NAME);
        // 获取验证码生成的时间
        Long startTime = (Long) session.getAttribute(Constant.SESSION_DATE_NAME);
        // 如果 captchaCode 和 startTime 为空 说明 session 未存储 或者 已经过期了
        if (!StringUtils.hasLength(captchaCode) || startTime == null
                || !captchaCode.equalsIgnoreCase(captcha) || !((System.currentTimeMillis() - startTime) < Constant.VALID_TIME_OUT)) {
            return false;
        } else {
            return true;
        }
        // 1. 验证码正确 && 未超时
        //        if (captchaCode.equalsIgnoreCase(captcha) && System.currentTimeMillis() - startTime < Constant.VALID_TIME_OUT) {
        //            return true;
        //        } else {
        //            return false;
        //        }
    }

}
