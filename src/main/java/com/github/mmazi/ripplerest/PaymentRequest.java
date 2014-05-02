package com.github.mmazi.ripplerest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentRequest extends RippleRequest {
    @JsonProperty
    private Payment payment;

    public PaymentRequest(String secret, String clientResourceId, Payment payment) {
        super(secret, clientResourceId);
        this.payment = payment;
    }
}
