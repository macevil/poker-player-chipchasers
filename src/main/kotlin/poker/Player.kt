package poker

import org.json.JSONObject
import org.json.JSONArray

class Player {

    fun betRequest(game_state: JSONObject): Int {
        try{
            println("chipchasers0")

            println(game_state.get("community_cards"))
            game_state.get("in_action")
            val players = game_state.getJSONArray("players")
            for (i in 0 until players.length()) {
                val player = players.getJSONObject(i)
                println("${player.get("bet")}, ${player.get("stack")}, ${player.get("name")}")
                if(player.get("name")=="chipchasers"){
                    val cards = player.getJSONArray("hole_cards")
                    val bolAce
                    for (i in 0 until cards.length()) {
                        val card = cards.getJSONObject(i)
                        println("${card.get("rank")}, ${card.get("suit")}")
                        if(card.get("rank")=="A"){
                            bolAce = true
                        }
                        if(card.get("rank")=="K"){
                            bolAce = true
                        }
                    }
                    if(bolAce){
                        return player.getInt("stack")
                    }else{
                        return 0
                    }
                } else{
                    return 0
                }
            }
        } catch (e: Exception){
            return 0
        }finally{
            return 0
        }
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.2"
    }

}
