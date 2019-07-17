package com.example.firstapp.main

interface MainActivityPresenterInterface {
    fun mockData()
}

class MainActivityPresenter: MainActivityPresenterInterface {

    var view: MainActivity

    constructor(view: MainActivity) {
        this.view = view
    }

    override fun mockData() {
        var model = MainModel(
            firstName = "Chayawat",
            lastName = "Suntornrak",
            age = "22"
        )

        view.getDataSuccess(model)
    }
}