import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.*

@Composable
@Preview
fun TablasApp() {
    val scope = rememberCoroutineScope()
    var tablas by remember { mutableStateOf(listOf<String>()) }

    LaunchedEffect(Unit) {
        val resultados = mutableListOf<String>()
        val jobs = mutableListOf<Job>()

        for (i in 1..10) {
            val job = scope.launch(Dispatchers.Default) {
                val sb = StringBuilder("Tabla del $i:\n")
                for (j in 1..10) {
                    sb.append("$j x $i = ${j * i}\n")
                    delay(30)
                }
                resultados.add(sb.toString())
            }
            jobs.add(job)
        }
        jobs.joinAll()
        tablas = resultados
    }

    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(Color(0xFFB388FF), Color(0xFF7C4DFF))
                    )
                )
                .padding(16.dp)
        ) {
            if (tablas.isEmpty()) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            } else {
                LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    items(tablas) { tabla ->
                        TablaCard(tabla)
                    }
                }
            }
        }
    }
}

@Composable
fun TablaCard(tabla: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.9f)),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            val lineas = tabla.split("\n")
            Text(
                text = lineas.first(),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF6200EA)
            )
            Spacer(modifier = Modifier.height(8.dp))
            for (linea in lineas.drop(1)) {
                if (linea.isNotBlank()) {
                    Text(text = linea, fontSize = 16.sp, color = Color.DarkGray)
                }
            }
        }
    }
}

fun main() = androidx.compose.ui.window.singleWindowApplication {
    TablasApp()
}
