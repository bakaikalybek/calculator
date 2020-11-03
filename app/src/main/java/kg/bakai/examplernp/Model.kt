package kg.bakai.examplernp

class Model public constructor(viewer: Viewer) {
    private var temp: String = ""
    private val viewer: Viewer = viewer

    public fun doAction(value: String) {
        when (value) {
            "1" -> temp += "1"
            "2" -> temp += "2"
            "3" -> temp += "3"
            "4" -> temp += "4"
            "5" -> temp += "5"
            "6" -> temp += "6"
            "7" -> temp += "7"
            "8" -> temp += "8"
            "9" -> temp += "9"
            "0" -> temp += "0"
            "-" -> temp += "-"
            "+" -> temp += "+"
            "*" -> temp += "*"
            "/" -> temp += "/"
            ")" -> temp += ")"
            "(" -> temp += "("

            "clear" -> {
                temp = " "
            }
            "=" -> {
                if (temp.isNotEmpty()) {
                    val connect = ConnectServer(temp, this)
                    connect.go()
                    viewer.update(temp)
                }
            }
            "." -> temp += "."
        }
        viewer.update(temp)
    }
    fun updateFromBackend(value: String) {
        temp = value
        viewer.update(temp)
    }

}