package net.matsudamper

enum class Page {
    Home,
    Watched,
    DevEnv,
    Camera,
    NotFound,
    ;

    val basePath: String
        get() = when (this) {
            Home -> "/"
            Watched -> "/watched/"
            DevEnv -> "/env/"
            Camera -> "/camera/"
            NotFound -> "/404/"
        }

    companion object {
        fun from(href: String): Page {
            return when {
                href.startsWith(Watched.basePath) -> Watched
                href.startsWith(DevEnv.basePath) -> DevEnv
                href.startsWith(Camera.basePath) -> Camera
                href.startsWith("") -> Home
                else -> NotFound
            }
        }
    }
}