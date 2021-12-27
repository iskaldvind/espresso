package io.iskaldvind.tests.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.iskaldvind.tests.model.SchedulerProvider
import io.iskaldvind.tests.presenter.RepositoryContract
import io.iskaldvind.tests.viewmodel.search.SearchViewModel

class ViewModelFactory constructor(
    private val repository: RepositoryContract,
    private val appSchedulerProvider: SchedulerProvider
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        SearchViewModel(repository, appSchedulerProvider) as T
}