package net.matsudamper.component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLSpanElement

@Composable
fun GoogleFont(
    name: String,
    attrs: AttrBuilderContext<HTMLSpanElement>? = null,
) {
    Span({
        attrs?.invoke(this)
        classes("material-icons")
    }) {
        Text(name)
    }
}
