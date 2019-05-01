package ltd.kaizo.realestatemanager.controller.ui.loan

import android.content.Context
import android.content.SharedPreferences
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.Assert.assertEquals
import ltd.kaizo.realestatemanager.utils.CURRENCY_EURO
import ltd.kaizo.realestatemanager.utils.DataRecordHelper
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class LoanSimViewModelTest {

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
    @Mock
    lateinit var loanSimViewModel: LoanSimViewModel
    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        this.loanSimViewModel = LoanSimViewModel()

        configureSharedPreferences()
    }

    private fun configureSharedPreferences() {
        val context = Mockito.mock(Context::class.java)
        val sharedPrefs = Mockito.mock(SharedPreferences::class.java)
        Mockito.`when`(context.packageName).thenReturn("prefs")
        Mockito.`when`(context.getSharedPreferences(ArgumentMatchers.anyString(), ArgumentMatchers.anyInt()))
            .thenReturn(sharedPrefs)
        DataRecordHelper.init(context)
        Mockito.`when`(DataRecordHelper.read(ArgumentMatchers.anyString(), ArgumentMatchers.anyString())).thenReturn(
            CURRENCY_EURO
        )
    }

    @Test
    fun givenMissingFieldValuesShouldReturnAFalseBoolean() {
        loanSimViewModel.totalAmount.value = "10000"
        loanSimViewModel.rate.value = "5"
        assertEquals(false, loanSimViewModel.checkFieldView())
    }
    @Test
    fun givenValuesShouldReturnATrueBoolean() {
        loanSimViewModel.totalAmount.value = "10000"
        loanSimViewModel.rate.value = "5"
        loanSimViewModel.duration.value = "15"
        assertEquals(true, loanSimViewModel.checkFieldView())
    }
    @Test
    fun givenValuesShouldReturnAMonthlyPayment() {
        val total =  10000.0
        val rate  = 5.0
        val contribution = 500.0
        val duration = 15
        assertEquals("75,13 €", loanSimViewModel.calculateMonthlyPayment(total, contribution, rate, duration))
    }
    @Test
    fun givenValuesShouldReturnATotalInterest() {
        val total =  100000.0
        val rate  = 4.2
        val contribution = 0.0
        val duration = 10
        assertEquals("42 000,00 €", loanSimViewModel.calculateTotalInvestment(total, contribution, rate, duration))
    }

}