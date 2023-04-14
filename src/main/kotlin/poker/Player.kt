package poker

import org.json.JSONObject

class Player {

    fun betRequest(game_state: JSONObject): Int {
        println("chipchasers0")
        println(game_state.getJSONArray("players"))
        println("chipchasers2")
        return 5
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.134"
    }
}
