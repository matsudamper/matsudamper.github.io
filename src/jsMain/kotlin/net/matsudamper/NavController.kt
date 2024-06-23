package net.matsudamper

import androidx.compose.runtime.Stable
import kotlinx.browser.window
import kotlinx.coroutines.flow.MutableStateFlow

@Stable
class NavController {
    val pageFlow: MutableStateFlow<Page> = MutableStateFlow(Page.Home)

    init {
        window.addEventListener(
            "popstate",
            callback = {
                setPage(window.location.pathname)
            },
        )
    }

    fun navigate(page: Page) {
        pageFlow.value = page
        window.history.pushState(null, "", page.basePath)
    }

    fun setPage(href: String) {
        pageFlow.value = Page.from(href)
    }
}
