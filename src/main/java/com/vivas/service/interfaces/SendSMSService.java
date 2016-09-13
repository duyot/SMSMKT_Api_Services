package com.vivas.service.interfaces;

import com.vivas.dto.MT;
import com.vivas.dto.MTList;
import com.vivas.dto.SendSMSResult;
import com.vivas.dto.UserDTO;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by duyot on 9/9/2016.
 */
@WebService(targetNamespace = "http://smsmkt.vivas.vn")
public interface SendSMSService {

    @WebMethod(operationName = "SendSMS")
    @WebResult(name = "SendSMSResult")
    public SendSMSResult sendSMS(@WebParam(name = "MT") MT mt);

    @WebMethod(operationName = "SendSMSList")
    @WebResult(name = "SendSMSListResult")
    public List<SendSMSResult> sendSMSList(@WebParam(name = "MT") MTList mtList);

    @WebMethod(operationName = "getUser")
    @WebResult(name = "userDTO")
    public UserDTO getUser(@WebParam(name = "userDTO") UserDTO userDTO);
}
