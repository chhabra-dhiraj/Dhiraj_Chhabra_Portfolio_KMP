import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dhiraj_chhabra.composeapp.generated.resources.Res
import dhiraj_chhabra.composeapp.generated.resources.dhiraj_avatar
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(64.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    painter = painterResource(Res.drawable.dhiraj_avatar),
                    modifier = Modifier
                        .size(160.dp)
                        .clip(
                            shape = CircleShape
                        ),
                    contentScale = ContentScale.Crop,
                    contentDescription = null
                )
                Row(
                    modifier = Modifier.align(Alignment.CenterEnd)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(end = 64.dp)
                            .clickable {

                            },
                        text = "Work",
                        fontSize = 24.sp,
                    )
                    Text(
                        modifier = Modifier
                            .clickable {

                            },
                        text = "Contact",
                        fontSize = 24.sp,
                    )
                }
            }
            Text(
                modifier = Modifier
                    .padding(horizontal = 32.dp),
                text = "\n" +
                        "Hi, it's Dhiraj Chhabra! \uD83D\uDC4B\n" +
                        "\uD83D\uDD2D I’m currently working on Herewith Android Application\n" +
                        "\uD83C\uDF31 I’m currently learning Financial Analysis using Python\n" +
                        "\uD83D\uDC6F I’m looking to collaborate on some cool startup ideas in FinTech\n" +
                        "\uD83E\uDD14 I’m looking for help with contributing to tech blogs and conferences\n" +
                        "\uD83D\uDCAC Ask me about Android Development, Finance and Chess\n" +
                        "⚡ Fun fact: I play at least one game of chess ♟\uFE0F every time I go to the toilet \uD83D\uDEBD",
                fontSize = 32.sp,
            )
        }
    }
}