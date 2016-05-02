package com.github.cstroe.sqs.model

import java.time.LocalDateTime

import com.github.cstroe.sqs.dao.{AccountDao, LineItemDao}
import org.joda.money.{CurrencyUnit, Money}
import org.scalatest.{FunSuite, Matchers}

import collection.JavaConverters._

class AccountSpec extends FunSuite with Matchers {
  test("Account Scenario") {
    val account = new AccountDao
    val li1 = new LineItemDao(account, LocalDateTime.now, Money.of(CurrencyUnit.USD, 100.00))
    val li2 = new LineItemDao(account, LocalDateTime.now, Money.of(CurrencyUnit.USD, -100.00))
    val li3 = new LineItemDao(account, LocalDateTime.now, Money.of(CurrencyUnit.USD, 50.00))
    account.setLineitems((li1 :: li2 :: li3 :: Nil).asJava)

    account.getBalance.doubleValue should be (50.00 +- 0.001)
  }
}
