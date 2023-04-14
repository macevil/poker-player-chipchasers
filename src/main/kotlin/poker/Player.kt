package poker

import org.json.JSONObject

class Player {

    fun betRequest(game_state: JSONObject): Int {
        return 5
    }

    fun showdown() {
    }

    fun version(): String {
        return "Kotlin Player 0.0.1"
    }
}
