package poker

import org.json.JSONObject

class Player {

    fun betRequest(game_state: JSONObject): Int {
        println("chipchasers0")
        JSONArray pets = game_state.getJSONArray("players")
        JSONArray cards = pets[1].getJSONArray("hole_cards")
        
        println(cards[0].getString("rank"))
        println("chipchasers1")
        return 5
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.1345"
    }
}
