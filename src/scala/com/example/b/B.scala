package com.example.b

//import com.example.a.A

trait B {
  def create: com.foo.a.A.type = com.foo.a.A

  def empty: String
}
