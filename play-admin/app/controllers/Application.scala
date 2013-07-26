package controllers.admin 

import play.api.mvc._

object Application extends Controller {
  def index = Action { implicit request =>
    Ok(views.html.admin.index("hello"))
  }
}