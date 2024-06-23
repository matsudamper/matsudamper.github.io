package net.matsudamper.page.home

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
internal fun Header() {
    Div({
        style {
            width(100.percent)
            padding(48.px)
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Row)
            boxSizing("border-box")
        }
    }) {
        Div({
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
            }
        }) {
            Img(
                src = "https://matsudamper.net/icon/3.png",
                alt = "icon",
                attrs = {
                    style {
                        borderRadius(50.percent)
                        width(100.px)
                        height(100.px)
                    }
                }
            )
        }
        Div({
            style {
                width(16.px)
            }
        }) { }
        Div({
            style {
                display(DisplayStyle.Flex)
                flexGrow(1)
                flexDirection(FlexDirection.Column)
            }
        }) {
            Text("matsudamper")
        }
    }
}
