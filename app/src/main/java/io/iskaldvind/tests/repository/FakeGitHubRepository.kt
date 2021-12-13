package io.iskaldvind.tests.repository

import io.iskaldvind.tests.model.SearchResponse
import io.iskaldvind.tests.presenter.RepositoryContract
import retrofit2.Response

internal class FakeGitHubRepository : RepositoryContract {

    override fun searchGithub(
        query: String,
        callback: RepositoryCallback
    ) {
        callback.handleGitHubResponse(Response.success(SearchResponse(42, listOf())))
    }
}
