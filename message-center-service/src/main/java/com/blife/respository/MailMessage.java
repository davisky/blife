package com.blife.respository;

import java.io.Serializable;

/**
 * Created by chen on 2017/6/20.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 邮件消息 bean
 */
public class MailMessage implements Serializable{

    private String from;

    private String to;

    private String subject;

    private String text;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
