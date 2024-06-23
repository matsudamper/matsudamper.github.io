package net.matsudamper.page.gear

import androidx.compose.runtime.Composable
import net.matsudamper.AppStyleSheet
import net.matsudamper.NavController
import net.matsudamper.Page
import net.matsudamper.component.FlexRow
import net.matsudamper.component.GoogleFont
import net.matsudamper.component.Spacer
import net.matsudamper.page.home.HomeCard
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
internal fun Gear(
    navController: NavController,
) {
    HomeCard(
        title = "Gear",
        content = {
            Item(
                title = "作業環境",
                onClick = {
                    navController.navigate(Page.DevEnv)
                },
            )
            Spacer(height = 8.px)
            Item(
                title = "カメラ",
                onClick = {
                    navController.navigate(Page.Camera)
                },
            )
        }
    )
}

@Composable
private fun Item(
    title: String,
    onClick: () -> Unit,
) {
    FlexRow({
        classes(AppStyleSheet.buttonHover)
        style {
            boxSizing("border-box")
            padding(8.px, 0.px)
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
        }
        onClick {
            onClick()
        }
    }) {
        Span({
            style {
                flexGrow(1)
            }
        }) {
            Text(title)
        }
        GoogleFont("chevron_right")
    }
}
