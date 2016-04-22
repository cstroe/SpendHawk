package com.github.cstroe.sqs.dao

import java.time.LocalDateTime

import org.scalatest.FlatSpec

class UserDaoSpec extends FlatSpec {
  val id = 1
  val login = "userlogin"
  val userDao = new UserDao

  "The NoteDao constructor" should "accept valid parameters" in {
    val user = new UserDao(id, login)
    assert(user.getId == id)
    assert(user.getLogin == login)
  }

  it should "not accept a negative id" in {
    intercept[IllegalArgumentException] {
      new UserDao(-1, login)
    }
  }

  it should "not accept a null login" in {
    intercept[NullPointerException] {
      new UserDao(id, null)
    }
  }

  "The UserDao id setter" should "not accept negative ids" in {
    intercept[IllegalArgumentException] {
      userDao.setId(-1)
    }
  }

  it should "set the id properly" in {
    userDao.setId(9232)
    assert(userDao.getId == 9232)
  }

  it should "not accept blank logins" in {
    intercept[IllegalArgumentException] {
      userDao.setLogin("")
    }
  }

  it should "not accept any whitespace in logins" in {
    intercept[IllegalArgumentException] { userDao.setLogin("     ") }
    intercept[IllegalArgumentException] { userDao.setLogin("\t") }
    intercept[IllegalArgumentException] { userDao.setLogin("\n") }
    intercept[IllegalArgumentException] { userDao.setLogin("login ") }
    intercept[IllegalArgumentException] { userDao.setLogin(" login") }
    intercept[IllegalArgumentException] { userDao.setLogin(" login ") }
    intercept[IllegalArgumentException] { userDao.setLogin("\tlogin") }
    intercept[IllegalArgumentException] { userDao.setLogin("login\n") }
  }

  "The UserDao login setter" should "not accept a null login" in {
    intercept[NullPointerException] {
      userDao.setLogin(null)
    }
  }

  it should "set the login properly" in {
    userDao.setLogin(login)
    assert(userDao.getLogin.equals(login))
  }
}
