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
            println(players.length())
            for (i in 0 until players.length()) {
                println(i)
                val player = players.getJSONObject(i)
                println("SLAYER")
                val name = player.getString("name")
                println(name)
                val chipchasers = "chipchasers"
                if(name.equals(chipchasers)){
                    val cards = player.getJSONArray("hole_cards")
                    var bolAce = false
                    println("YYY")
                    for (i in 0 until cards.length()) {
                        val card = cards.getJSONObject(i)
                        println("${card.get("rank")}, ${card.get("suit")}")
                        println("XXX")
                        if(card.getString("rank").equals("A")){
                            println("AAAA")
                            bolAce = true
                        }
                        if(card.getString("rank").equals("K")){
                            println("KKKK")
                            bolAce = true
                        }
                        if(card.getString("rank").equals("D")){
                            println("DDDD")
                            bolAce = true
                        }
                    }
                    if(bolAce){
                        println("1111")
                        println(""+player.getInt("stack"))
                        println("stack")
                        return player.getInt("stack")
                    }else{
                        println("2222")
                        return 0
                    }
                }
            }
            return 0
        } catch (e: Exception){
            return 0
        }
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.3"
    }

}
