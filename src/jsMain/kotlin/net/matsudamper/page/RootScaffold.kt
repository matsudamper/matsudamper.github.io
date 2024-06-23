package net.matsudamper.page

import ResizeObserver
import androidx.compose.runtime.*
import kotlinx.browser.document
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement

private const val RootId = "root-scaffold"

@Composable
internal fun RootScaffold(
    attrs: AttrBuilderContext<HTMLDivElement>? = null,
    content: @Composable () -> Unit,
) {
    var width by remember { mutableDoubleStateOf(0.toDouble()) }
    DisposableEffect(Unit) {
        val element = document.getElementById(RootId)!!
        val observer = ResizeObserver {
            val rect = element.getBoundingClientRect()
            width = rect.width
        }
        observer.observe(element)
        onDispose {
            observer.disconnect()
        }
    }

    Div(
        attrs = {
            id(RootId)
            style {
                display(DisplayStyle.Block)
            }
            attrs?.invoke(this)
        }
    ) {
        val movableContent = movableContentOf { content() }
        Div(
            attrs = {
                style {
                    width(100.percent)
                    height(100.percent)
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Row)
                }
            }
        ) {
            Div(
                attrs = {
                    style {
                        width(100.percent)
                        height(100.percent)
                        overflowY("auto")
                    }
                }
            ) {
                movableContent()
            }
        }
    }
}
