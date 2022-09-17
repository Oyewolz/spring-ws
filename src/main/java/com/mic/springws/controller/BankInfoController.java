package com.mic.springws.controller;

import com.mic.springws.service.BankInfoService;
import com.mic.springws.ws.GetBankResponseType;
import com.mic.springws.ws.GetBankType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author toyewole
 */

@RestController
public class BankInfoController {


    @Autowired
    BankInfoService bankInfoService;

    @GetMapping("/bank-info/{bankCode}")
    public GetBankResponseType getBankResponseType(@PathVariable  String bankCode) {

        GetBankType bankType = new GetBankType();
        bankType.setBlz(bankCode);
        return bankInfoService.getBankInformation(bankType);
    }
}
