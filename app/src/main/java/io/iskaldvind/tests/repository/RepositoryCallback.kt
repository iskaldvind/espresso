package io.iskaldvind.tests.repository

import io.iskaldvind.tests.model.SearchResponse
import retrofit2.Response

interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}
