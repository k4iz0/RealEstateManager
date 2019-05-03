package ltd.kaizo.realestatemanager.controller.ui.search

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.Assert.assertEquals
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import java.util.concurrent.Executor

class SearchViewModelTest {
    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
    @Mock
    lateinit var searchViewModel: SearchViewModel
    @Mock
    lateinit var estateRepository: EstateRepository
    @Mock
    lateinit var executor: Executor

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        this.searchViewModel = SearchViewModel(estateRepository, executor)

    }

    @Test
    fun givenNoValuesShouldReturnDefaultRequest() {
        assertEquals("SELECT * FROM Estate", searchViewModel.configureQuery())
        assertEquals(0, searchViewModel.argsList.size)
    }

    @Test
    fun givenTwoValuesShouldReturnCorrectRequest() {
        searchViewModel.surfaceMaxi.value = "300"
        searchViewModel.priceMini.value = "300000"
        assertEquals("SELECT * FROM Estate WHERE surface <= ? AND price >= ?", searchViewModel.configureQuery())
        assertEquals("300", searchViewModel.argsList[0])
        assertEquals(300000, searchViewModel.argsList[1])
    }

    @Test
    fun givenMultipleValuesShouldReturnCorrectRequest() {
        searchViewModel.surfaceMini.value = "300"
        searchViewModel.surfaceMaxi.value = "1300"
        searchViewModel.priceMini.value = "300000"
        searchViewModel.priceMaxi.value = "800000"
        searchViewModel.nbBathroomMini.value = "2"
        searchViewModel.nbBathroomMaxi.value = "4"
        searchViewModel.area.value = "brooklyn"
        assertEquals("SELECT * FROM Estate WHERE" +
                " surface >= ? " +
                "AND surface <= ? " +
                "AND nbBathroom >= ? " +
                "AND nbBathroom <= ? " +
                "AND price >= ? " +
                "AND price <= ? " +
                "AND (address  LIKE ? " +
                "OR city LIKE ? " +
                "OR postalCode LIKE ?)", searchViewModel.configureQuery())
        assertEquals("300", searchViewModel.argsList[0])
        assertEquals("1300", searchViewModel.argsList[1])
        assertEquals(2, searchViewModel.argsList[2])
        assertEquals(4, searchViewModel.argsList[3])
        assertEquals(300000, searchViewModel.argsList[4])
        assertEquals(800000, searchViewModel.argsList[5])
        assertEquals("%brooklyn%", searchViewModel.argsList[6])
        assertEquals("%brooklyn%", searchViewModel.argsList[7])
        assertEquals("%brooklyn%", searchViewModel.argsList[8])

    }
}