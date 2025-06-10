package shopping.list

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import shopping.list.ui.theme.MyListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(Modifier.padding(innerPadding)) {
                        Text("Hello Android")
                    }
                }
            }
        }
    }
}

fun main() {
    val item1 = ShoppingItem("Milk")
}

data class ShoppingItem(
    val name: String,
    var isBought: Boolean = false
)

@Composable
fun ShoppingItemCard(item: ShoppingItem) {
    Text(
        text=item.name,
        fontSize = 18.sp
        )
}

@Preview(showBackground = true)
@Composable
fun ShoppingItemCardPreview() {
    ShoppingItemCard(ShoppingItem("Молоко"))
}