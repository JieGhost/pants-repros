package com.example.b

import com.example.a.A

object B {
  // def create: com.example.a.A.type = com.example.a.A
  // def empty: String
  val a = implicitly[Manifest[A]]
}
