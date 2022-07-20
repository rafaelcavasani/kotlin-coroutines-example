package com.kotlin.coroutines.application.port.input

interface AccountBalanceValidationUseCase {
    suspend fun execute(): String
}