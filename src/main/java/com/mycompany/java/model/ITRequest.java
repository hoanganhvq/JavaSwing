package com.mycompany.java.model;

import java.sql.Date;

/**
 *
 * @author MyPC
 */
public class ITRequest {
    private int ReqID;
    private String ReqName;
    private Date ReqDate;
    private String ReqEmail;
    private String ReqType;
    private String ReqDetails;

    public int getReqID() {
        return ReqID;
    }

    public void setReqID(int ReqID) {
        this.ReqID = ReqID;
    }

    public String getReqName() {
        return ReqName;
    }

    public void setReqName(String ReqName) {
        this.ReqName = ReqName;
    }

    public Date getReqDate() {
        return ReqDate;
    }

    public void setReqDate(Date ReqDate) {
        this.ReqDate = ReqDate;
    }

    public String getReqEmail() {
        return ReqEmail;
    }

    public void setReqEmail(String ReqEmail) {
        this.ReqEmail = ReqEmail;
    }

    public String getReqType() {
        return ReqType;
    }

    public void setReqType(String ReqType) {
        this.ReqType = ReqType;
    }

    public String getReqDetails() {
        return ReqDetails;
    }

    public void setReqDetails(String ReqDetails) {
        this.ReqDetails = ReqDetails;
    }
}
