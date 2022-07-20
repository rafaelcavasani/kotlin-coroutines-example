package com.kotlin.coroutines.application.service

import com.kotlin.coroutines.application.port.input.AccountBalanceValidationUseCase
import kotlinx.coroutines.delay
import org.springframework.stereotype.Service

@Service
class AccountBalanceValidationService: AccountBalanceValidationUseCase {
    override suspend fun execute(): String {
        println("Account balance validation init")
        delay(1000L)
        println("Account balance validation finish")
        return "Account balance validation: 1000"
    }
}