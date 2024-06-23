package net.matsudamper

import androidx.compose.runtime.*
import kotlinx.browser.window
import net.matsudamper.page.RootScaffold
import net.matsudamper.page.watched.Watched
import net.matsudamper.page.home.Home
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        val navController by remember { mutableStateOf(NavController()) }
        LaunchedEffect(navController) {
            navController.setPage(window.location.href)
        }
        Style(AppStyleSheet)
        Body(
            navController = navController,
        )
    }
}

@Composable
private fun Body(
    navController: NavController,
) {
    val page by navController.pageFlow.collectAsState()
    RootScaffold(
        attrs = {
            style {
                width(100.vw)
                height(100.vh)
                background("#FFFFFF")
            }
        },
        content = {
            when (page) {
                Page.Home -> {
                    Home(
                        navController = navController,
                    )
                }

                Page.Watched -> {
                    Watched()
                }

                Page.DevEnv -> {
                    Text(navController.pageFlow.collectAsState().value.toString())
                }

                Page.Camera -> {
                    Text(navController.pageFlow.collectAsState().value.toString())
                }

                Page.NotFound -> {
                    Text("404 Not Found")
                }
            }
        }
    )
}
