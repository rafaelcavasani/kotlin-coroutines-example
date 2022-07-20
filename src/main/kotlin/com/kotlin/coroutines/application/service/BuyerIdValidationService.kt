package com.kotlin.coroutines.application.service

import com.kotlin.coroutines.application.port.input.BuyerIdValidationUseCase
import kotlinx.coroutines.delay
import org.springframework.stereotype.Service

@Service
class BuyerIdValidationService: BuyerIdValidationUseCase {
    override suspend fun execute(): String {
        println("Buyer id validation init")
        delay(2000L)
        println("Buyer id validation finish")
        return "Buyer id validation: 2000"
    }
}