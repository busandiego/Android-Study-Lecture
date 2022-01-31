package com.example.android.guesstheword.screens.game

import androidx.lifecycle.ViewModel
import android.util.Log

class GameViewModel: ViewModel() {

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    // The current word
    var word = ""

    // The current score
    var score = 0

    init{
        Log.i("GameViewModel", "GameViewModel init")
        resetList()

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
            gameFinished()
        } else {
            word = wordList.removeAt(0)
        }
        updateWordText()
        updateScoreText()
    }


    /** Methods for buttons presses **/
    private fun onSkip() {
        score--
        nextWord()
    }

    private fun onCorrect() {
        score++
        nextWord()
    }

}
