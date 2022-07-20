package com.kotlin.coroutines.adapter.input.web.v1.api.request

import java.math.BigDecimal

data class MakePaymentRequest(
    val paymentId: String,
    val buyerId: Int,
    val sellerId: Int,
    val value: BigDecimal
)
