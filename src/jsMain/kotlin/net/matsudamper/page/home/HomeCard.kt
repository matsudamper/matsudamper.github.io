package net.matsudamper.page.home

import androidx.compose.runtime.Composable
import net.matsudamper.component.Card
import net.matsudamper.component.HorizontalDivider
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
internal fun HomeCard(
    title: String,
    content: @Composable () -> Unit,
) {
    val margin = 8.px
    Card({
        style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
        }
    }) {
        P({
            style {
                margin(0.px, 0.px, margin, 0.px)
            }
        }) {
            Text(title)
        }
        HorizontalDivider()
        Div(
            attrs = {
                style {
                    margin(margin, 0.px, 0.px, 0.px)
                }
            }
        ) { }
        content()
    }
}
