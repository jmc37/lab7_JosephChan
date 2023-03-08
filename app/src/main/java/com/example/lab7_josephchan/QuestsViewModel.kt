package com.example.lab7_josephchan

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class QuestsViewModel(val quests: ArrayList<Quest> = arrayListOf()) : ViewModel() {
    fun startNewQuest( sidekick:Sidekick, item:Item){
        val quest = Quest()
        quest.id = Random.nextInt(1, 999)
        quest.sidekick = sidekick
        quest.item = item
        quest.savedHyrule = didSaveHyrule()
        quests.add(quest)
    }

    private fun didSaveHyrule(): Boolean {
        if(Random.nextInt(1, 10) > 5 ){
            return true
        }
        return false
    }
}