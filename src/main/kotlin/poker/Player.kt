package poker

import org.json.JSONObject
import org.json.JSONArray

class Player {

    fun betRequest(game_state: String): Int {
        println("chipchasers0")
        println(game_state)
        val json = JSONObject(gameState)
        println(json)
        return 100
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.1345"
    }
}
