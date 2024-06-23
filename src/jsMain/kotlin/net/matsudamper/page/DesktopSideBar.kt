package net.matsudamper.page

import androidx.compose.runtime.*
import net.matsudamper.NavController
import net.matsudamper.Page
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text



@Composable
internal fun DesktopSideBar(
    navController: NavController,
) {
    val page by navController.pageFlow.collectAsState()
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                height(100.percent)
            }
        }
    ) {
        Div(
            attrs = {
                style {
                    padding(1.em)
                }
            }
        ) {
            Div(
                attrs = {
                    style {
                        fontSize(1.8.em)
                        textAlign("right")
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Column)
                    }
                }
            ) {
                Span { Text("matsudamper") }
                Span { Text("のHP") }
            }
        }
        Div(
            attrs = {
                style {
                    width(100.percent)
                    height(1.px)
                    background(Color.red.toString())
                }
            }
        )
        Div(
            attrs = {
                style {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    flexGrow(1)
                }
            }
        ) {
            Span {
                ListButton(
                    onClick = {
                        navController.navigate(Page.Home)
                    },
                    text = "TOP",
                    selected = page == Page.Home,
                )
            }
            Span {
                ListButton(
                    onClick = {
                        navController.navigate(Page.DevEnv)
                    },
                    text = "開発環境",
                    selected = page == Page.DevEnv,
                )
            }
            Span {
                ListButton(
                    onClick = {
                        navController.navigate(Page.Watched)
                    },
                    text = "鑑賞作品",
                    selected = page == Page.Watched,
                )
            }
        }
        Div(
            attrs = {
                style {
                    width(100.percent)
                    height(1.px)
                    background(Color.red.toString())
                }
            }
        )
        Div {
            Span {
                Text("Bottom")
            }
        }
    }
}

@Composable
private fun ListButton(
    onClick: () -> Unit,
    text: String,
    selected: Boolean,
) {
    Span(
        attrs = {
            style {
                background(
                    if (selected) {
                        Color.red
                    } else {
                        Color.transparent
                    }.toString()
                )
            }
            onClick {
                onClick()
            }
        }
    ) {
        Text(text)
    }
}