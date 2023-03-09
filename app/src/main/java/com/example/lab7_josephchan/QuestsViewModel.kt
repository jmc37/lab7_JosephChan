package com.example.lab7_josephchan

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class QuestsViewModel:ViewModel() {
    val quests = ArrayList<Quest>()

    fun startNewQuest(sidekick: Sidekick, item: Item){
        val currentQuest = Quest((1..999).random(), sidekick, item, didSaveHyrule())
        quests.add(currentQuest)
    }

    private fun didSaveHyrule(): Boolean {
        return listOf(true, false).random()
    }
}