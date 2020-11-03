package kg.bakai.examplernp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class Viewer : AppCompatActivity() {
    private val controller: Controller = Controller(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonSendMessage = buttonCalculate
        buttonSendMessage.setOnClickListener(controller)

        val zero = zero
        zero.setOnClickListener(controller)

        val one = one
        one.setOnClickListener(controller)

        val two = two
        two.setOnClickListener(controller)

        val three = three
        three.setOnClickListener(controller)

        val four = four
        four.setOnClickListener(controller)

        val five = five
        five.setOnClickListener(controller)

        val six = six
        six.setOnClickListener(controller)

        val seven = seven
        seven.setOnClickListener(controller)

        val eight = eight
        eight.setOnClickListener(controller)

        val nine = nine
        nine.setOnClickListener(controller)

        val point = point
        point.setOnClickListener(controller)

        val plus = plus
        plus.setOnClickListener(controller)

        val minus = minus
        minus.setOnClickListener(controller)

        val multiply = multiply
        multiply.setOnClickListener(controller)

        val divide = divide
        divide.setOnClickListener(controller)

        val clear = buttonAC
        clear.setOnClickListener(controller)

        val bracketsOpen = bracketsOpen
        bracketsOpen.setOnClickListener(controller)

        val bracketsClose = bracketsClose
        bracketsClose.setOnClickListener(controller)

        val dot = point
        bracketsClose.setOnClickListener(controller)
    }

    public fun getMessage(): String {
        val editText = findViewById<TextView>(R.id.editText)
        return editText.text.toString();
    }

    public fun update(text: String) {
        val textView = findViewById<TextView>(R.id.editText)
        textView.setText(text)
    }

}