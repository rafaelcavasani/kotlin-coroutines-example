package com.kotlin.coroutines.application.port.input

interface BankAccountValidationUseCase {
    suspend fun execute(): String
}