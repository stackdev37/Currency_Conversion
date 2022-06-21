package com.stackdev37.currencyexchangeservice.controller;

import com.stackdev37.currencyexchangeservice.constants.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @GetMapping("currentcy-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchageValue(@PathVariable String from, @PathVariable String to) {
        // takig the exchange value
        ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
        // picking port from the environment
        String port = environment.getProperty("local.server.port");
        if(port != null)
            exchangeValue.setPort(Integer.parseInt(port));

        return exchangeValue;
    }
}
