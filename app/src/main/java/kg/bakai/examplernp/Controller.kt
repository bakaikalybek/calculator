package kg.bakai.examplernp

import android.view.View

public class Controller : View.OnClickListener {
    private val model: Model
    constructor(viewer: Viewer) {
        model = Model(viewer)
    }

    override fun onClick(view: View) {
        var action = "";
        when(view.id) {
            R.id.zero -> action ="0"
            R.id.one -> action = "1"
            R.id.two -> action = "2"
            R.id.three -> action = "3"
            R.id.four -> action = "4"
            R.id.five -> action = "5"
            R.id.six -> action = "6"
            R.id.seven -> action = "7"
            R.id.eight -> action = "8"
            R.id.nine -> action = "9"
            R.id.bracketsOpen -> action = "("
            R.id.bracketsClose -> action = ")"
            R.id.plus -> action = "+"
            R.id.minus -> action = "-"
            R.id.divide -> action = "/"
            R.id.multiply -> action = "*"
            R.id.buttonCalculate -> action = "="
            R.id.buttonAC -> action = "clear"
            R.id.point -> action = "."
        }
        model.doAction(action)
    }
}