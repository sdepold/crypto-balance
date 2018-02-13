package net.barfooz.cryptobalance

import org.scalatra.test.scalatest._

class CryptoBalanceServletTests extends ScalatraFunSuite {

  addServlet(classOf[CryptoBalanceServlet], "/*")

  test("GET / on CryptoBalanceServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
