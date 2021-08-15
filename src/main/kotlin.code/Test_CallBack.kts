fun postItem(item: Item) {
    preparePostAsync {
        token -> submitPostAsync(token, item) {
            post -> processPost(post)
        }
    }
}

fun preparePostAsync(callback: (Token) -> Unit) {
    //make request and return immediately
    postItem("Language")
}

preparePostAsync { "Kotlin" }