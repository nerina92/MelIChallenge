package com.example.melichallenge.domain

import com.example.melichallenge.data.MeliChallengeRepository
import com.example.melichallenge.domain.model.Item
import com.example.melichallenge.domain.model.SearchRowMeliChallenge
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetSearchResultUseCaseTest{
    @RelaxedMockK
    private lateinit var repository: MeliChallengeRepository
    lateinit var getSearchResultUseCase: GetSearchResultUseCase
    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getSearchResultUseCase=GetSearchResultUseCase(repository = repository)
    }

    @Test
    fun `when the api doesnt return anything then return emptyList`() = runBlocking {
        //Given (dado)
        coEvery { repository.getSearchResponse("123zxcvbnm") } returns emptyList()
        //When (cuando)
        val response = getSearchResultUseCase("123zxcvbnm")
        //Thenn(entonces)
        coVerify(exactly = 1) {repository.getSearchResponse("123zxcvbnm") }
        assert(response == emptyList<Item>())
    }
    //asdfgh
    @Test
    fun `when the api return anything then return sameList`() = runBlocking {
        val myList= listOf<SearchRowMeliChallenge>(
            SearchRowMeliChallenge("MLA740554221","Mini Teclado Inalambrico Touchpad Para Smart Tv - Polotecno","http://http2.mlstatic.com/D_765713-MLA46263863767_062021-I.jpg","3520", ""),
            SearchRowMeliChallenge("MLA757551912","Mini Teclado Inalambrico Touchpad Para Smart Tv","http://http2.mlstatic.com/D_832043-MLA46263877385_062021-I.jpg","2035.5", "")
        )
        //Given (dado)
        coEvery { repository.getSearchResponse("asdfgh") } returns myList
        //When (cuando)
        val response = getSearchResultUseCase("asdfgh")
        //Thenn(entonces)
        coVerify(exactly = 1) {repository.getSearchResponse("asdfgh") }
        assert(response == myList)
    }

}