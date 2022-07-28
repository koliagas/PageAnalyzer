package learn.code.controllers;

import io.javalin.http.Handler;

public final class RootController {

    public static Handler welcome = ctx -> ctx.render("index.html");
    public static Handler urls = ctx -> ctx.render("urls.html");
}
