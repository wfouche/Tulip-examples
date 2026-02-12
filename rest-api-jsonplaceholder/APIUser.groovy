//GROOVY 5.0.4

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import io.github.wfouche.tulip.user.HttpUser

class APIUser extends HttpUser {

    private static final Logger log = LoggerFactory.getLogger(APIUser)

    // Action 1: GET /posts
    boolean action1() {
        def response = httpGet("/posts")
        response.successful
    }

    // Action 2: POST /posts
    boolean action2() {
        def payload = """
        {
            "title": "Tulip Test Post",
            "body": "This is a test post created during load testing",
            "userId": 1
        }       
        """
        def response = httpPost(payload, "/posts")
        response.successful
    }

    // Action 3: GET /posts/{id}
    boolean action3() {
        def postId = 1
        def response = httpGet("/posts/{id}", postId)
        response.successful
    }

    Logger logger() {
        log
    }
}