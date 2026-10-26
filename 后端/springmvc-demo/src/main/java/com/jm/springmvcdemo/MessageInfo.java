package com.jm.springmvcdemo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MessageInfo {

    private String from;

    private String to;

    private String message;

}
