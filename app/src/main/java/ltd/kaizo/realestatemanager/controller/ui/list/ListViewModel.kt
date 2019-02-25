package ltd.kaizo.realestatemanager.controller.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ltd.kaizo.realestatemanager.model.Estate
import ltd.kaizo.realestatemanager.repositories.EstateRepository
import java.util.concurrent.Executor

class ListViewModel(val estateDataSource:EstateRepository, val executor: Executor) : ViewModel() {
val estateList = estateDataSource.getAllEstate()

    fun getEstateById(id: Int): LiveData<Estate> {
        return estateDataSource.getEstateById(id)
    }
    //https://maps.googleapis.com/maps/api/staticmap?
    // center=avenue+de+la+resistance,lannion,
    // &zoom=13
    // &size=600x300
    // &maptype=roadmap
    // &markers=color:green%7Clabel:G%7C40.711614,-74.012318
    // &key=AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc

//geocoding address
    //https://maps.googleapis.com/maps/api/geocode/json?address=avenue%20de%20la%20resistance,%20lannion&sensor=false&key=AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc
    fun getStaticMapUrlFromAdress(address: String) :String{
        val zoom=13
        val size=200
        val type="roadmap"
        val apiKey="AIzaSyCBcjFQJr7i9K22a9ulsTQ_WntkQHX35qc"

       return "https://maps.googleapis.com/maps/api/staticmap?center=$address&zoom=$zoom&size=${size}x$size&maptype=$type&key=$apiKey"

    }
}
