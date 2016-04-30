package com.github.cstroe.sqs.dao

import java.time.LocalDateTime

import org.scalatest.FlatSpec

class IdentityDaoSpec extends FlatSpec {
  val id = 1
  val name = "username"
  val identityDao = new IdentityDao

  "The constructor" should "accept valid parameters" in {
    val user = new IdentityDao(id, name)
    assert(user.getId == id)
    assert(user.getName == name)
  }

  it should "not accept a negative id" in {
    intercept[IllegalArgumentException] {
      new IdentityDao(-1, name)
    }
  }

  it should "not accept a null login" in {
    intercept[NullPointerException] {
      new IdentityDao(id, null)
    }
  }

  "The id setter" should "not accept negative ids" in {
    intercept[IllegalArgumentException] {
      identityDao.setId(-1)
    }
  }

  it should "set the id properly" in {
    identityDao.setId(9232)
    assert(identityDao.getId == 9232)
  }

  it should "not accept blank logins" in {
    intercept[IllegalArgumentException] {
      identityDao.setName("")
    }
  }

  it should "not accept any whitespace in logins" in {
    intercept[IllegalArgumentException] { identityDao.setName("     ") }
    intercept[IllegalArgumentException] { identityDao.setName("\t") }
    intercept[IllegalArgumentException] { identityDao.setName("\n") }
    intercept[IllegalArgumentException] { identityDao.setName("login ") }
    intercept[IllegalArgumentException] { identityDao.setName(" login") }
    intercept[IllegalArgumentException] { identityDao.setName(" login ") }
    intercept[IllegalArgumentException] { identityDao.setName("\tlogin") }
    intercept[IllegalArgumentException] { identityDao.setName("login\n") }
  }

  "The name setter" should "not accept null" in {
    intercept[NullPointerException] {
      identityDao.setName(null)
    }
  }

  it should "set the name properly" in {
    identityDao.setName(name)
    assert(identityDao.getName.equals(name))
  }
}
