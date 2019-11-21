import com.sun.tools.javac.util.Log;

import java.util.function.Consumer;

import static spark.Spark.*;

public class ItinaryService {

    public static void main(String[] args) {

        get("/hello", (req, res) -> "Hello, world");

        get("/hello/:name", (req,res) -> {
            return "Hello, "+ req.params(":name");
        });

        get("/hello/:name", (request, response) -> {
            return "Hello: " + request.params(":name");
        });

    }

    private Consumer<Exception> initExceptionHandler = (e) -> {
        System.out.println("An erreur occured");
        System.exit(100);
    };

}
