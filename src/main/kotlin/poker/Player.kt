package poker

import org.json.JSONObject

class Player {

    fun betRequest(game_state: JSONObject): Int {
        println(game_state.players[1].hole_cards)
        return 0
    }

    fun showdown() {
    }

    fun version(): String {
        return "Kotlin Player 0.0.1"
    }
}
