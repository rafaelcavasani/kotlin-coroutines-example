package com.kotlin.coroutines.application.service

import com.kotlin.coroutines.application.port.input.AccountBalanceValidationUseCase
import com.kotlin.coroutines.application.port.input.BankAccountValidationUseCase
import com.kotlin.coroutines.application.port.input.BuyerIdValidationUseCase
import com.kotlin.coroutines.application.port.input.MakePaymentUseCase
import com.kotlin.coroutines.application.port.input.SellerIdValidationUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service

@Service
class MakePaymentService(
    private val accountBalanceValidationUseCase: AccountBalanceValidationUseCase,
    private val bankAccountValidationUseCase: BankAccountValidationUseCase,
    private val buyerIdValidationUseCase: BuyerIdValidationUseCase,
    private val sellerIdValidationUseCase: SellerIdValidationUseCase
): MakePaymentUseCase {

    override fun execute() {

        runBlocking {
            val accountBalance = async(Dispatchers.Default) { accountBalanceValidationUseCase.execute() }
            val bankAccount = async(Dispatchers.Default) { bankAccountValidationUseCase.execute() }
            val buyerIdValidation = async(Dispatchers.Default) { buyerIdValidationUseCase.execute() }
            val sellerIdValidation = async(Dispatchers.Default) { sellerIdValidationUseCase.execute() }

            println("Finish all dispatchers")
            println(sellerIdValidation.await())
            println(bankAccount.await())
            println(accountBalance.await())
            println(buyerIdValidation.await())
        }

    }

}