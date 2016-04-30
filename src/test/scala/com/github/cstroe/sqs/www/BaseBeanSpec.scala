package com.github.cstroe.sqs.www

import org.scalatest.FunSuite

class BaseBeanSpec extends FunSuite {
  test("Should provide frontend library versions") {
    val baseBean = new BaseBean
    assert(baseBean.getResource("jquery_version") != "")
    assert(baseBean.getResource("semanticui_version") != "")
  }
}