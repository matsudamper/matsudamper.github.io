package net.matsudamper.page.home

import androidx.compose.runtime.Composable
import net.matsudamper.component.Spacer
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
internal fun HomeLinks() {
    val spaceWidth = 8.px
    HomeCard("Links") {
        LinksItem(
            title = {
                Text("GitHub")
            },
            text = {
                Link(
                    text = "matsudamper",
                    href = "https://github.com/matsudamper"
                )
            },
        )
        Spacer(height = spaceWidth)
        LinksItem(
            title = {
                Text("Twitter")
            },
            text = {
                Link(
                    text = "@matsudamper",
                    href = "https://twitter.com/matsudamper"
                )
            },
        )
        Spacer(height = spaceWidth)
        LinksItem(
            title = {
                Text("mstdn.jp")
            },
            text = {
                Link(
                    text = "@matsudamper",
                    href = "https://mstdn.jp/@matsudamper"
                )
            },
        )
        Spacer(height = spaceWidth)
        LinksItem(
            title = {
                Text("技術ブログ")
            },
            text = {
                Link(
                    text = "アプリ開発備忘録",
                    href = "https://matsudamper.hatenablog.com/"
                )
            },
        )
        Spacer(height = spaceWidth)
        LinksItem(
            title = {
                Text("Blog")
            },
            text = {
                Link(
                    text = "阿呆の浅知恵",
                    href = "https://matsudamper.hatenablog.jp/"
                )
            },
        )
        Spacer(height = spaceWidth)
        LinksItem(
            title = {
                Text("開発プロダクト(旧)")
            },
            text = {
                Link(
                    text = "M.D.P. Software",
                    href = "https://software.matsudamper.net/",
                )
            },
        )
    }
}

@Composable
private fun Link(text: String, href: String) {
    A(
        href = href,
        attrs = {
            style {
                color(Color.blue)
            }
        }
    ) {
        Text(text)
    }
}

@Composable
private fun LinksItem(
    title: @Composable () -> Unit,
    text: @Composable () -> Unit,
) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
            }
        }
    ) {
        Div {
            title()
        }
        Div {
            text()
        }
    }
}