package com.creheart.bella.bean;

import java.util.Date;

/**
 * Created by sunny-chen on 2017/7/23.
 */
public class BellaMember {

    private Long ID;

    private String accountID;

    private String accountName;

    private String password;

    private String email;

    private Date addTime;

    private int status;

    private String headPicFileUrl;

    private String mobilePhone;

    private String nickName;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHeadPicFileUrl() {
        return headPicFileUrl;
    }

    public void setHeadPicFileUrl(String headPicFileUrl) {
        this.headPicFileUrl = headPicFileUrl;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
