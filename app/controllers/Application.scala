package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok("hello world")
  }

  def hello(name: String) = Action {
    Ok(views.html.hello(name))
  }

}