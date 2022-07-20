package com.kotlin.coroutines.application.service

import com.kotlin.coroutines.application.port.input.BankAccountValidationUseCase
import kotlinx.coroutines.delay
import org.springframework.stereotype.Service

@Service
class BankAccountValidationService: BankAccountValidationUseCase {
    override suspend fun execute(): String {
        println("Bank account validation init")
        delay(500L)
        println("Bank account validation finish")
        return "Bank account validation: 500"
    }
}