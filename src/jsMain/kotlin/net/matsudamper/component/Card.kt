package net.matsudamper.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

@Composable
internal fun Card(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    content: @Composable () -> Unit,
) {
    Div(
        attrs = {
            attrs?.invoke(this)
            style {
                width(100.percent)
                padding(16.px)
                background("#FFFFFF")
                borderRadius(8.px)
                boxSizing("border-box")
                property("box-shadow", "0 0 8px 0 rgba(0, 0, 0, 0.1)")
            }
        }
    ) {
        content()
    }
}
