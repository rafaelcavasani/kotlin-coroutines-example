package com.kotlin.coroutines.application.service

import com.kotlin.coroutines.application.port.input.SellerIdValidationUseCase
import kotlinx.coroutines.delay
import org.springframework.stereotype.Service

@Service
class SellerIdValidationService: SellerIdValidationUseCase {
    override suspend fun execute(): String {
        println("Seller id validation init")
        delay(800L)
        println("Seller id validation finish")
        return "Seller id validation: 800"
    }
}