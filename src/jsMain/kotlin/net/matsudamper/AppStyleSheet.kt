package net.matsudamper

import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.backgroundColor

object AppStyleSheet : StyleSheet() {
    val buttonHover by style {
        self + hover style {
            backgroundColor(Color("#f0f0f0"))
        }
    }
}
