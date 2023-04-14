package poker

import org.json.JSONObject

class Player {

    fun betRequest(game_state: JSONObject): Int {
        println("chipchasers0")
        println(game_state.getString("round"))
        println(game_state.getString("bet_index"))
        println(game_state.getString("small_blind"))
        println(game_state.getString("orbits"))
        println(game_state.getString("dealer"))
        println(game_state.getString("pot"))
        return 5
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.1345"
    }
}
