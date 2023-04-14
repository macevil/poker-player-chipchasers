package poker

import org.json.JSONObject
import org.json.JSONArray

class Player {

    fun betRequest(game_state: JSONObject): Int {
        println("chipchasers0")

        println(game_state.get("community_cards"))
        game_state.get("in_action")
        val players = game_state.getJSONArray("players")
        for (i in 0 until players.length()) {
            val player = players.getJSONObject(i)
            println("${player.get("bet")}, ${player.get("stack")}, ${player.get("name")}")
            //if(${player.get("name")}.equals("test")){
            //    println("test")
            //}else{
            //    println("test2")
            //}
        }
        println(game_state.getJSONArray("players").get(4).get("stack"))
        game_state.get("tournament_id")
        game_state.get("current_buy_in")
        game_state.get("round")
        game_state.get("pot")
        game_state.get("minimum_raise")
        game_state.get("big_blind")
        game_state.get("orbits")
        game_state.get("bet_index")
        game_state.get("dealer")
        game_state.get("small_blind")
        game_state.get("game_id")

        return 6
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.1345"
    }

}
