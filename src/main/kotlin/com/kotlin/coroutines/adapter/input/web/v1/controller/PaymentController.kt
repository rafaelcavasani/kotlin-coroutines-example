package com.kotlin.coroutines.adapter.input.web.v1.controller

import com.kotlin.coroutines.adapter.input.web.v1.api.PaymentApi
import com.kotlin.coroutines.application.service.MakePaymentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/payments")
class PaymentController(
    private val makePaymentService: MakePaymentService
): PaymentApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    override fun makePayment() {
        makePaymentService.execute()
    }

}