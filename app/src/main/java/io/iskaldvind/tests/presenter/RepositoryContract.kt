package io.iskaldvind.tests.presenter

import io.iskaldvind.tests.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}
