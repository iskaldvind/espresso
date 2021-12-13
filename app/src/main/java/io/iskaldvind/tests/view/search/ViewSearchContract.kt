package io.iskaldvind.tests.view.search

import io.iskaldvind.tests.model.SearchResult
import io.iskaldvind.tests.view.ViewContract

internal interface ViewSearchContract : ViewContract {
    fun displaySearchResults(
        searchResults: List<SearchResult>,
        totalCount: Int
    )

    fun displayError()
    fun displayError(error: String)
    fun displayLoading(show: Boolean)
}
