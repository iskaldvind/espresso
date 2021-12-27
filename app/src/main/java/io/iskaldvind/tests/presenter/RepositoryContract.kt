package io.iskaldvind.tests.presenter

import io.iskaldvind.tests.model.SearchResponse
import io.iskaldvind.tests.repository.RepositoryCallback
import io.reactivex.Observable

interface RepositoryContract {

    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )

    fun searchGithub(
        query: String
    ): Observable<SearchResponse>

    suspend fun searchGithubAsync(
        query: String
    ): SearchResponse

}
