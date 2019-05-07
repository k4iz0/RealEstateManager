package ltd.kaizo.realestatemanager.controller.ui.add

import android.content.Context
import android.content.res.Resources
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.Assert.assertEquals
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import ltd.kaizo.realestatemanager.utils.DateUtils.getDateFromString
import net.danlew.android.joda.JodaTimeAndroid
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import java.io.InputStream
import java.util.concurrent.Executor


class EstateViewModelTest {
    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
    @Mock
    lateinit var estateViewModel: EstateViewModel
    @Mock
    lateinit var estateRepository: EstateRepository
    @Mock
    lateinit var executor: Executor

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        this.estateViewModel = EstateViewModel(estateRepository, executor)
//        description.value = "description"
        estateViewModel.address.value = "toto"
        estateViewModel.postalCode.value = "22300"
        estateViewModel.city.value = "lannion"
        estateViewModel.surface.value = "450"
        estateViewModel.nbRoom.value = 10
        estateViewModel.nbBedroom.value = 4
        estateViewModel.nbBathroom.value = 2
        estateViewModel.price.value = "350000"
        estateViewModel.type.value = 2
    }

    @Before
    fun prepareBeforeTests() {
        val context = mock(Context::class.java)
        val appContext = mock(Context::class.java)
        val resources = mock(Resources::class.java)
        `when`(resources.openRawResource(anyInt())).thenReturn(mock(InputStream::class.java))
        `when`<Resources>(appContext.resources).thenReturn(resources)
        `when`<Context>(context.applicationContext).thenReturn(appContext)
        JodaTimeAndroid.init(context)
    }

    private fun generateEstate(): Estate {
        return Estate(
            100,
            "content/test/picture",
            "Loft",
            3299000,
            300,
            5,
            2,
            5,
            "maison de mitch buchannon",
            "rue Malibu",
            "4568442",
            "MALIBU",
            "",
            false,
            getDateFromString("01/02/2019")!!,
            null,
            "Yann",
            0.0,
            0.0
        )
    }

    @Test
    fun givenAListOfLiveDataWithMissingValueShouldReturnTheCheckFieldBooleanFalse() {
        assertEquals(false, estateViewModel.checkFieldView())
    }

    @Test
    fun givenAListOfLiveDataShouldReturnTheCheckFieldBooleanTrue() {
        estateViewModel.description.value = "description"
        assertEquals(true, estateViewModel.checkFieldView())
    }

    @Test
    fun givenAnEstateShouldUpdateLiveDataValueWithEstateValue() {
        estateViewModel.updateUiWithData(generateEstate())
        assertEquals("maison de mitch buchannon", estateViewModel.description.value)
        assertEquals("300", estateViewModel.surface.value)
        assertEquals("rue Malibu", estateViewModel.address.value)
        assertEquals("4568442", estateViewModel.postalCode.value)
        assertEquals("MALIBU", estateViewModel.city.value)
        assertEquals("01/02/2019", estateViewModel.dateIn.value)
        assertEquals("", estateViewModel.dateOut.value)
        assertEquals("3299000", estateViewModel.price.value)
    }
}