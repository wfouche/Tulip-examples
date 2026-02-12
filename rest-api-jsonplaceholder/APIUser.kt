//KOTLIN 2.2.21

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import io.github.wfouche.tulip.user.HttpUser

class APIUser : HttpUser() {
    // Action 1: GET /posts
    override fun action1(): Boolean {
        val response = httpGet("/posts")
        return response.isSuccessful()
    }

    // Action 2: POST /posts
    override fun action2(): Boolean {
        val payload: String = """
        {
            "title": "Tulip Test Post",
            "body": "This is a test post created during load testing",
            "userId": 1
        }       
        
        """.trimIndent()
        val response = httpPost(payload, "/posts")
        return response.isSuccessful()
    }

    // Action 3: GET /posts/{id}
    override  fun action3(): Boolean {
        val post_id = 1
        val response = httpGet("/posts/{id}", post_id)
        return response.isSuccessful()
    }

    override  fun logger(): Logger {
        return elog
    }

    companion object {
        // Logger
        private val elog: Logger = LoggerFactory.getLogger(APIUser::class.java)
    }
}