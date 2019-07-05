package com.example.firstapp

interface MainActivityPresenterInterface {
    fun mockData()
}

class MainActivityPresenter: MainActivityPresenterInterface {

    var view: MainActivity

    constructor(view: MainActivity) {
        this.view = view
    }

    override fun mockData() {
        var model = MainModel()
        model.age = "22"
        model.firstname = "Chayawat"
        model.lastname = "Suntornrak"

        view.getDataSuccess(model)
    }
}