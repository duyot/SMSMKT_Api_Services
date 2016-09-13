package com.vivas.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by duyot on 9/12/2016.
 */
//@XmlRootElement(name = "MT")
//@XmlAccessorType(XmlAccessType.FIELD)
public class MTList {

    List<MT> SMSRequest;

    public MTList(List<MT> SMSRequest) {
        this.SMSRequest = SMSRequest;
    }

    public MTList() {
    }

    public List<MT> getSMSRequest() {
        return SMSRequest;
    }

    public void setSMSRequest(List<MT> SMSRequest) {
        this.SMSRequest = SMSRequest;
    }
}
