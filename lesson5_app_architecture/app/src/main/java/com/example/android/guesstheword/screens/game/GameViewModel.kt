package com.example.android.guesstheword.screens.game

import androidx.lifecycle.ViewModel
import android.util.Log

class GameViewModel: ViewModel() {

    init{
        Log.i("GameViewModel", "GameViewModel init")
        //
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameVioewModel", "GameVideModel destroyed!")
    }
}
