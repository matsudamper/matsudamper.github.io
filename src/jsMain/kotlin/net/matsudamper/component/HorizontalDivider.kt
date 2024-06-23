package net.matsudamper.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
internal fun HorizontalDivider() {
    Div({
        style {
            width(100.percent)
            height(0.5.px)
            backgroundColor(Color.lightgray)
        }
    }) { }
}
