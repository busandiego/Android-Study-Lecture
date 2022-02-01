package com.example.android.guesstheword.screens.game

import androidx.lifecycle.ViewModel
import android.util.Log
import androidx.lifecycle.MutableLiveData

class GameViewModel: ViewModel() {

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    // The current word
    val word = MutableLiveData<String>()

    // The current score
    // var score = 0
    val score = MutableLiveData<Int>()


    init{
        Log.i("GameViewModel", "GameViewModel init")
        resetList()
        nextWord()
        score.value = 0
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameVioewModel", "GameVideModel destroyed!")
    }


    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }
    /**
     * Moves to the next word in the list
     */
    private fun nextWord() {
        //Select and remove a word from the list
        if (wordList.isEmpty()) {
            // gameFinished()
        } else {
            word.value = wordList.removeAt(0)
        }
       // updateWordText()
       // updateScoreText()
    }


    /** Methods for buttons presses **/
    fun onSkip() {
       score.value = (score.value)?.minus(1)
        nextWord()
    }

    fun onCorrect() {
        score.value = (score.value)?.plus(1)
        nextWord()
    }

}
