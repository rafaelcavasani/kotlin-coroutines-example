package com.kotlin.coroutines.application.port.input

interface BuyerIdValidationUseCase {
    suspend fun execute(): String
}