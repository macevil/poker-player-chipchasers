package poker

import kotlin.*

class Player {

    fun betRequest(game_state: JSONObject): Int {
        println("chipchasers0")
        JSONArray pets = game_state.getJSONArray("players")
        return 5
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.1345"
    }
}
