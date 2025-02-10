package com.example.coffeeshop.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coffeeshop.model.api.CoffeeRepository
import com.example.coffeeshop.model.entities.Coffee
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel@Inject constructor(
    private val coffeeRepository: CoffeeRepository
) : ViewModel() {


    private val _coffeeMenu = MutableLiveData<List<Coffee>>()
    val coffeeMenu: LiveData<List<Coffee>> get() = _coffeeMenu

    private val _typesList = MutableLiveData<List<String>>()
    val typesList: LiveData<List<String>> get() = _typesList
    


    init {
        _coffeeMenu.value = coffeeRepository.getCoffeeMenu()
        if (_coffeeMenu.value != null){
            _coffeeMenu.value!!.forEach {
                if (_typesList.value == null){
                    _typesList.value = listOf("All Coffee")
                }else{
                    if (!(_typesList.value!!.contains(it.type))){
                        _typesList.value = _typesList.value?.plus(it.type) ?: listOf(it.type)
                    }
                }
            }
        }
    }
}
