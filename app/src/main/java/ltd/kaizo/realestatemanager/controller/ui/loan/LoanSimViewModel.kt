package ltd.kaizo.realestatemanager.controller.ui.loan

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.utils.Utils.formatNumberFromCurrency
import java.lang.Math.abs
import kotlin.math.pow

class LoanSimViewModel : ViewModel() {
    val message = MutableLiveData<String>()
    val totalAmount = MutableLiveData<String>()
    val contribution = MutableLiveData<String>()
    val rate = MutableLiveData<String>()
    val duration = MutableLiveData<String>()
    val monthlyPayment = MutableLiveData<String>()
    val totalInterest = MutableLiveData<String>()


    fun calculate() {
        if (checkFieldView()) {
            monthlyPayment.value = calculateMonthlyPayment(
                totalAmount.value!!.toDouble(),
                setContribution(contribution.value),
                rate.value!!.toDouble(),
                duration.value!!.toInt()
            )
            totalInterest.value = calculateInterest(
                totalAmount.value!!.toDouble(),
                setContribution(contribution.value),
                rate.value!!.toDouble(),
                duration.value!!.toInt()
            )
        } else {
            message.value = "verify your data"
        }
    }

    private fun checkFieldView() = (
            !totalAmount.value.isNullOrBlank()
                    && !rate.value.isNullOrBlank()
                    && !duration.value.isNullOrBlank()
            )

    private fun setContribution(str: String?): Double = if (str.isNullOrBlank()) 0.0 else str.toDouble()


    private fun calculateMonthlyPayment(
        totalAmount: Double,
        contribution: Double,
        rate: Double,
        duration: Int
    ): String {
        val capital = totalAmount - contribution
        val monthlyRate = (rate / 100) / 12
        val monthDuration = duration * 12
        val result: Double = abs((capital * monthlyRate) / (1 - ((1 + monthlyRate).pow(-monthDuration))))
        //Mensualité = ( K x T ) / ( 1 - ( 1 + T )-d )
        return formatNumberFromCurrency(result)
    }

    private fun calculateInterest(
        totalAmount: Double,
        contribution: Double,
        rate: Double,
        duration: Int
    ): String {
        val capital = totalAmount - contribution
        var result = 0.0
        //Mensualité = ( K x T ) / ( 1 - ( 1 + T )-d )
        result = (capital * rate * duration) / 100
        return formatNumberFromCurrency(result)
    }
}