package controllers

import javax.inject.Inject

import play.api.mvc._

/**
  * A very small controller that renders a home page.
  * A request gets turned into results which is part of the action. Because you will be using that requests quite a lot most of the time you want to define it implicitly so that you
  * do not have to use it every time.
  * method index returns ok that means status code 200 and it is using a template called index to renter the page
  */
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { implicit request =>
    Ok(views.html.index())
  }

  def test = Action { implicit request =>
    Ok(views.html.test())
  }

  def example = Action { implicit request =>
    Ok(views.html.example("Your new application is ready."))
  }

  }
