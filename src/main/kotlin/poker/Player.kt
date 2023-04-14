package poker

import org.json.JSONObject

class Player {

    fun betRequest(game_state: JSONObject): Int {
        println("chipchasers0")
        println(game_state.get("round"))
        println(game_state.get("bet_index"))
        println(game_state.get("small_blind"))
        println(game_state.get("orbits"))
        println(game_state.get("dealer"))
        println("chipchasers2")
        return 5
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.1345"
    }
}
