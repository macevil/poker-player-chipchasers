package poker

import org.json.JSONObject
import org.json.JSONArray

class Player {

    @RequestMapping(value = "/betRequest", method = RequestMethod.POST, consumes="application/json")
    fun betRequest(game_state: JSONObject): Int {
        println("chipchasers0")
        return 100
    }

    fun showdown() {
        println("chipchasers showdown")
    }

    fun version(): String {
        return "Kotlin Player 0.0.1345"
    }
}
