package ltd.kaizo.realestatemanager.controller.ui.add

import androidx.databinding.library.baseAdapters.BR.estateViewModel
import androidx.lifecycle.MutableLiveData
import junit.framework.Assert.assertEquals
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import java.util.concurrent.Executor

class EstateViewModelTest {
//    @Rule
//    var rule: TestRule = InstantTaskExecutorRule()
    @Mock
    lateinit var estateViewModel: EstateViewModel
    @Mock
    lateinit var estateRepository: EstateRepository
    @Mock
    lateinit var executor: Executor

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        this.estateViewModel = EstateViewModel(estateRepository,executor)
//        description.value = "description"
       estateViewModel.address.value="toto"
       estateViewModel.postalCode.value = "22300"
       estateViewModel.city.value = "lannion"
       estateViewModel.surface.value = "450"
       estateViewModel.nbRoom.value = 10
       estateViewModel.nbBedroom.value = 4
       estateViewModel.nbBathroom.value = 2
       estateViewModel.price.value = "350000"
       estateViewModel.type.value= 2
    }
    @Test
    fun givenAListOfLiveDataShouldReturnTheCheckFieldBoolean() {
        assertEquals("false",estateViewModel.checkFieldView())
    }
}