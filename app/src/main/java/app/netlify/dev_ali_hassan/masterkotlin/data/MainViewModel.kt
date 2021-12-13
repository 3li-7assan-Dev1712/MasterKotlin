package app.netlify.dev_ali_hassan.masterkotlin.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.netlify.dev_ali_hassan.masterkotlin.datasource.DataSource
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val liveData = MutableLiveData<Int>()
    companion object {
        private const val TAG = "MainViewModel"
        private var tapCount = 0
    }


    val dataSource = DataSource()
    fun updateTap() {

        viewModelScope.launch {
            ++tapCount
            delay(1000)
            Log.d(TAG, "updateTap: ")
            liveData.postValue(tapCount)
        }

    }
}