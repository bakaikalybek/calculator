package kg.bakai.examplernp

import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket

class ConnectServer(private val message: String, private val model: Model) : Thread() {
    private var result: String = ""
    fun go() {
        start()
    }

    override fun run() {
        send(message)
    }

    fun send(text: String?) {
        try {
            println("Start send.")
            val socket = Socket("194.152.37.7", 4446)
            val writer = ObjectOutputStream(socket.getOutputStream())
            val reader = ObjectInputStream(socket.getInputStream())
            writer.writeUTF(message)
            writer.flush()
            result = reader.readUTF()
            println("result from Backend " + result)
            writer.close()
            reader.close()
            socket.close()
            model.updateFromBackend(result)
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
