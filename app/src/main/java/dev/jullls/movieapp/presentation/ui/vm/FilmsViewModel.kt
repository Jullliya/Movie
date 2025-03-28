package dev.jullls.movieapp.presentation.ui.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.jullls.movieapp.data.network.RetrofitClient
import dev.jullls.movieapp.domain.model.Film
import kotlinx.coroutines.launch

class FilmsViewModel : ViewModel() {
    private val _films = MutableLiveData<List<Film>>()
    val films: LiveData<List<Film>> = _films
    private val _isLoading = MutableLiveData<Boolean>()
    private val _error = MutableLiveData<String?>()

    fun loadTop250() {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                val response = RetrofitClient.api.getTop250()
                _films.value = response.docs
                _error.value = null
            } catch (e: Exception) {
                _error.value = "Ошибка загрузки: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }
}