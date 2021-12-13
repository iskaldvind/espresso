package io.iskaldvind.tests.presenter.details

import io.iskaldvind.tests.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
