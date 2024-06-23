package net.matsudamper.page.home

import androidx.compose.runtime.Composable
import net.matsudamper.NavController
import net.matsudamper.component.Spacer
import net.matsudamper.page.gear.Gear
import net.matsudamper.page.history.History
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
internal fun Home(
    navController: NavController,
) {
    Div({
        style {
            width(100.percent)
            height(100.percent)
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
        }
    }) {
        Div({
            style {
                flexGrow(1)
                maxWidth(500.px)
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
            }
        }) {
            Header()
            HomeLinks()
            Spacer(height = 16.px)
            Gear(navController = navController)
            Spacer(height = 16.px)
            History()
        }
    }
}
