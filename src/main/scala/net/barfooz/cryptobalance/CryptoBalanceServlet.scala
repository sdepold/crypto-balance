package net.barfooz.cryptobalance

import org.scalatra._

class CryptoBalanceServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
