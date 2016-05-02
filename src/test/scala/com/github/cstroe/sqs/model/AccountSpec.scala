package com.github.cstroe.sqs.model

import java.time.LocalDateTime

import com.github.cstroe.sqs.dao.{AccountDao, LineItemDao}
import org.joda.money.{CurrencyUnit, Money}
import org.scalatest.{FunSuite, Matchers}

import collection.JavaConverters._

class AccountSpec extends FunSuite with Matchers {
  test("Zero balance when no line items") {
    val account = new AccountDao
    account.getBalance should be (0.00 +- 0.001)
  }

  test("getBalance should compute total across LineItems") {
    val account = new AccountDao
    val li1 = new LineItemDao(account, LocalDateTime.now, Money.of(CurrencyUnit.USD, 100.00))
    val li2 = new LineItemDao(account, LocalDateTime.now, Money.of(CurrencyUnit.USD, -100.00))
    val li3 = new LineItemDao(account, LocalDateTime.now, Money.of(CurrencyUnit.USD, 50.00))
    account.setLineitems((li1 :: li2 :: li3 :: Nil).asJava)

    account.getBalance should be (50.00 +- 0.001)
  }
}
