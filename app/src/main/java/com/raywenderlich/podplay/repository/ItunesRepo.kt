package com.raywenderlich.podplay.repository

import com.raywenderlich.podplay.service.ItunesService
import com.raywenderlich.podplay.service.PodcastResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// Class to hide service behind repository , only class that has access
// to itunes service
class ItunesRepo(private val itunesService: ItunesService) {

    suspend fun searchByTerm(term: String) = itunesService.searchPodcastByTerm(term)

}
