package com.kotlin.coroutines.application.port.input

interface SellerIdValidationUseCase {
    suspend fun execute(): String
}