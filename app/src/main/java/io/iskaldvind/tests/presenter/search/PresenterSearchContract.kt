package io.iskaldvind.tests.presenter.search

import io.iskaldvind.tests.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}
