package com.stackdev37.currencyexchangeservice.constants;

import java.math.BigDecimal;

public class ExchangeValue {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMuliple;
    private int port;

    public ExchangeValue() {}

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMuliple) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMuliple = conversionMuliple;
    }

    // generating getters
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Long getId(){
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMuliple() {
        return conversionMuliple;
    }
}
