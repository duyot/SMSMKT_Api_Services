package com.vivas.service.impl;

import com.vivas.dto.MT;
import com.vivas.dto.MTList;
import com.vivas.dto.SendSMSResult;
import com.vivas.dto.UserDTO;
import com.vivas.service.interfaces.SendSMSService;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by duyot on 9/9/2016.
 */
@WebService(endpointInterface = "com.vivas.service.interfaces.SendSMSService",serviceName = "SendSMSService")
public class SendSMSServiceImpl implements SendSMSService {

    public SendSMSResult sendSMS(MT mt) {
        return  new SendSMSResult("23232","SUCESS","SUCCESS","23A343");
    }

    public List<SendSMSResult> sendSMSList(MTList mtList) {
        List<SendSMSResult> lstSendSMSResults = new ArrayList<>();
        lstSendSMSResults.add(new SendSMSResult("23232","SUCESS","SUCCESS","23A343"));
        lstSendSMSResults.add(new SendSMSResult("5456","SUCESS","SUCCESS","23A3434564"));
        return lstSendSMSResults;
    }

    public UserDTO getUser(UserDTO userDTO) {
        return new UserDTO(userDTO.getUsername(),"123456a@");
    }
}
