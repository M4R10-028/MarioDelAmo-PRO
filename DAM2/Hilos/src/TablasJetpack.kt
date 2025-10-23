import java.awt.AWTException
import java.awt.SystemTray
import java.awt.TrayIcon
import java.awt.image.BufferedImage
import java.util.Timer
import java.util.TimerTask

fun main() {
    val tiempo = Timer()
    val intervalo = 1L
    val segundos = intervalo * 60 * 1000

    val recordatorio = object : TimerTask(){
        override fun run() {
            mostrarMensajeLevantate()
        }
    }
    tiempo.scheduleAtFixedRate(recordatorio,0, segundos)

    readLine()
}

fun mostrarMensajeLevantate() {
    System.setProperty("java.awt.headless", "false")

    if (!SystemTray.isSupported()) {
        println("SystemTray no está soportado en este sistema.")
        return
    }

    val tray = SystemTray.getSystemTray()

    // Crear una imagen vacía de 1x1 píxeles (prácticamente invisible)
    val image = BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB)

    val trayIcon = TrayIcon(image, "Recordatorio")
    trayIcon.isImageAutoSize = true

    try {
        tray.add(trayIcon)
    } catch (e: AWTException) {
        println("No se pudo agregar el TrayIcon: ${e.message}")
        return
    }

    trayIcon.displayMessage(
        "¡Hora de levantarse!",
        "Levántate de la silla y estírate un poco 🧘‍♀️",
        TrayIcon.MessageType.INFO
    )

    // Remover el icono después de unos segundos para no dejarlo colgado
    Thread {
        Thread.sleep(5000)
        tray.remove(trayIcon)
    }.start()
}